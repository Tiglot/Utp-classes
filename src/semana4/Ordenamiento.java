package semana4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Ordenamiento {

    public static void main(String[] args) {

        // Ordenamiento

        // 1. Ordenar el array data usando el método sort de la clase ArrayList
        ArrayList<String> data = new ArrayList<>(
                Arrays.asList("Juan","Ana","Rosa"));
        data.sort(Comparator.naturalOrder());
        assert (data.get(0).equals("Ana")) : "El primer elemento no es Ana";
        assert (data.get(1).equals("Juan")) : "El primer elemento no es Juan";
        assert (data.get(2).equals("Rosa")) : "El primer elemento no es Rosa";

        // 2. Ordernar el array puntos con el metodo sort
        Integer[] puntos = {50,35,20,10,0};
        Arrays.sort(puntos);

        assert (puntos[0] == 0): "El primer elemento no es 0";
        assert (puntos[1] == 10): "El segundo elemento no es 10";
        assert (puntos[2] == 20): "El tercer elemento no es 20";
        assert (puntos[3] == 35): "El cuarto elemento no es 35";
        assert (puntos[4] == 50): "El quinto elemento no es 50";

        System.out.println("Programa finalizado correctamente");

    }
}
