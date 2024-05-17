package semana4;

public class Acceso {

    public static void main(String[] args) {

        // Acceso a datos del array

                 // idx =>  0   1   2   3   4   5   6   7   8   9  10
        char[] alfabeto = {'A','E','I','O','U','B','C','T','P','N','M'};

        // 1. Obtener la letra B del array alfabeto
        char letra = alfabeto[5];
        assert (letra == 'B') : "La letra no es B";
        System.out.println("Ejercicio 1 - OK");

        // 2. Obtener la letra M utilizando como indice el valor de size_alfabeto
        int size_alfabeto = alfabeto.length;
        letra = alfabeto[size_alfabeto - 1];
        assert (letra == 'M') : "La letra no es M";
        System.out.println("Ejercicio 2 - OK");

        // 3. Formar la palabra UTP
        char u = 4,t = 7,p = 8;
        u = alfabeto[u];
        t = alfabeto[t];
        p = alfabeto[p];
        System.out.printf("%c%c%c\n",u,t,p);
        assert (u+t+p) == 249 : "No se formo la palabra UTP";
        System.out.println("Ejercicio 3 - OK");

        System.out.println("Programa finalizado correctamente");

    }
}
