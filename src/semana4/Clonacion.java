package semana4;

import java.util.ArrayList;
import java.util.Arrays;

public class Clonacion {

    public static void main(String[] args) {

        // Clonado

        // 1. Clonar la variable data en info
        ArrayList<String> data = new ArrayList<>(
                Arrays.asList("Juan","Ana","Rosa"));

        ArrayList<String> info = (ArrayList<String>) data.clone();

        assert(info.size() == 3): "El array no tiene 3 elementos";

        // 2. Clonar la variable dias en la variable days
        ArrayList<Integer> dias = new ArrayList(
                Arrays.asList(10,20,30,40,50,60));

        ArrayList<Integer> days = (ArrayList<Integer>) dias.clone();

        assert (days.size() == 6): "El array no tiene 6 elementos";

    }
}
