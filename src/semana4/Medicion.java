package semana4;

public class Medicion {
    public static void main(String[] args) {

        // Medición de arrays
        // Nota: Habilitar las aserciones con el flag -ea

        // 1. Asignar 5 valores al array notas,
        //    y guarda el tamaño del array en la variable size_notas
        int[] notas = {10,20,30, 40, 50};
        int size_notas = notas.length;
        assert (size_notas == 5): "Las notas no contiene 5 elementos";
        System.out.println("Ejercicio 1 - OK");

        // 2. Mide el tamaño del array lista y guarda el valor en size_lista
        String[] lista = {"C++", "Java", "Python"};
        int size_lista = lista.length;
        assert (size_lista == 3): "La lista no contiene 3 elementos";
        System.out.println("Ejercicio 2 - OK");

        // 3.
        char[] iniciales = {'A','E','I'};
        int size_ini = iniciales.length;
        assert (size_ini == 3): "Las iniciales no contiene 5 elementos";
        System.out.println("Ejercicio 3 - OK");

        System.out.println("Programa finalizado correctamente");

    }
}
