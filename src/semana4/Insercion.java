package semana4;

import java.util.ArrayList;
import java.util.Arrays;

public class Insercion {

    public static void main(String[] args) {

        // Insercion de datos

        // 1. Usando el metodo add de la clase ArrayList, agrega 3 elementos
        ArrayList<Integer> data = new ArrayList(
                Arrays.asList(10,20,30,40));
        data.add(50);
        data.add(60);
        data.add(70);
        assert (data.size() == 7) : "El array data no tiene 7 elementos";
        System.out.println("SUCESSO EXERCICO 1");

        // 2. Agrega el elemento 1 y 5 al inicio del array
        data.add(0, 1);
        data.add(1, 5);
        assert (data.get(0) == 1) : "El primer elemento no es 1";
        assert (data.get(1) == 5) : "El segundo elemento no es 5";

        System.out.println("Programa finalizado correctamente");

    }
}
