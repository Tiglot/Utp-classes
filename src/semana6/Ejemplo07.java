package semana6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Ejemplo07 {
    public static void main(String[] args) {
        ArrayList<String> sedes = new ArrayList<>(
                Arrays.asList("Chiclayo", "Lima", "Arequipa", "Piura", "Trujillo")
        );

        //obtener el indice de chiclayo
        System.out.println("Indice de Chiclayo" + sedes.indexOf("Chiclayo"));

        //obtener el ultimo indice de elemento chiclayo
        System.out.println("Indice de Chiclayo" + sedes.lastIndexOf("Chiclayo"));
        //ordenar com el metodo sort usando el orden natural
        sedes.sort(Comparator.naturalOrder());
        //mostrar las sedes
        for (String item: sedes)
            System.out.println(item);
    }
}
