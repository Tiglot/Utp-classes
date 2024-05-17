package semana6;

import java.util.ArrayList;
import java.util.Arrays;

public class Ejemplo06 {
    public static void main(String[] args) {
        ArrayList<String> sedes = new ArrayList<>(
                Arrays.asList("Chiclayo", "Lima", "Arequipa", "Piura", "Trujillo")
        );

        sedes.clear();
        System.out.println("Siedes no tienen elementos:" + sedes.isEmpty());

    }
}
