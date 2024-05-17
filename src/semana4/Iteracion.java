package semana4;

public class Iteracion {
    public static void main(String[] args) {

        // Iteracion

        String[] ciudades = {"Chiclayo","Piura","Trujillo"};

        // 1. Iterar las ciudades usando fori
        for(int i=0; i< ciudades.length; i++)
            System.out.println(ciudades[i]);

        // 2. Iterar las ciudades usando for
        for(String item:ciudades)
            System.out.println(item);
        // 3. Copiar los arrays de la clase Creacion e iterarlos
        int[] notas = {2, 3, 4, 5};
        for(int item:notas)
            System.out.println(item);

    }
}
