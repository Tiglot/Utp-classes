package semana6;

import java.util.ArrayList;
import java.util.Arrays;

public class Ejemplo05 {
        public static void main(String[] args) {
            ArrayList<String> sedes = new ArrayList<>(
                    Arrays.asList("Chiclayo", "Lima", "Arequipa", "Piura", "Trujillo")
            );
            ArrayList<String> sedes_visitadas= new ArrayList<>(
                    Arrays.asList("Lima", "Piura")
            );

            //eliminar sedes visitadas de sedes
            sedes.removeAll(sedes_visitadas);

            //iterar sedes
            for (String item: sedes)
                System.out.println(item);

            //adicionar sedes vistidas em sedes
            sedes.addAll(sedes_visitadas);

            //iterar dnv
            for (String item: sedes)
                System.out.println(item);
        }
}
