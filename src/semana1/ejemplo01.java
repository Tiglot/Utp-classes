package semana1;

public class ejemplo01 {
    public static void main(String[] args) {
        String nombre1, nombre2;
        nombre1 = "Pedro";
        nombre2 = "Juan";

        System.out.println(nombre1);
        System.out.println(nombre2);

        int[] edad = {1, 2, 4,3};
        System.out.println("array desorganizado");
        for(int item:edad)
            System.out.println(item);
        Ordena.bubbleSort(edad);
        System.out.println("array organizado");
        for(int item:edad)
            System.out.println(item);
    }

    public static void swap_1(int[] arreglo, int i, int j)
    {
        int aux = arreglo[i];
        arreglo[i] = arreglo[j];
        arreglo[j] = aux;

    }
}