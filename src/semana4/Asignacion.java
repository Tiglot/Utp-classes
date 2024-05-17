package semana4;

public class Asignacion {
    public static void main(String[] args) {

        // Asignacion de valores

        // 1. Modifica los valores del array para obtener la palabra FERNANDO
                // idx => 0   1   2   3   4   5   6   7
        char[] nombre = {'F','E','R','N','A','N','D','O'};
        assert (String.valueOf(nombre).equals("FERNANDO")): "El nombre no es FERNANDO";

        // 2. Modifica los valores del array usando la asignacion para obtener: {Fids,Juan,Ana}
        String[] alumnos = {"Fids","Juan","Ana"};
        assert (alumnos[0].equals("Fids")) : "El primer elemento no es Fids";
        assert (alumnos[1].equals("Juan")) : "El segundo elemento no es Juan";
        assert (alumnos[2].equals("Ana")) : "El tercer elemento no es Ana";

        // 3. Modifica el array notas usando asignaciones a partir de las variables PC1,PC2,PC3,EF
        //    El orden de registro de notas es: EF, PC2, PC1 y PC3
            int PC1 = 20;
            int PC2 = 18;
            int PC3 = 19;
            int EF = 17;
        int[] notas = {EF,PC2,PC1,PC3};

        assert (notas[2] == PC1) : "La nota de la PC1 es incorrecta";
        assert (notas[1] == PC2) : "La nota de la PC2 es incorrecta";
        assert (notas[3] == PC3) : "La nota de la PC3 es incorrecta";
        assert (notas[0] == EF) : "La nota del EF1 es incorrecta";

        System.out.println("Programa finalizado correctamente");

    }
}

