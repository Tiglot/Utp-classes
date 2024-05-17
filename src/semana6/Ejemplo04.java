package semana6;

import java.util.ArrayList;
import java.util.Arrays;

public class Ejemplo04 {
    public static void main(String[] args)
        {
            ArrayList<String> sedes = new ArrayList<>(
                    Arrays.asList("Chiclayo", "Lima", "Arequipa", "Piura", "Trujillo")
            );

        //crear nueva lista com lima e piura sedes
        ArrayList<String> sedes_visitadas= new ArrayList<>(
                Arrays.asList("Lima", "Piura")
        );

        System.out.println("Sedes visitadas estan en sedes:" + sedes.containsAll(sedes_visitadas));

        sedes_visitadas.add("iquitos");

        System.out.println("Sedes visitadas estan en sedes:" + sedes.containsAll(sedes_visitadas));
    }
}
