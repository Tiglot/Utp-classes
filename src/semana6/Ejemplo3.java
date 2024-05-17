package semana6;

import java.util.ArrayList;

public class Ejemplo3 {
    public static void main(String[] args)
    {
        ArrayList<String> sedes = new ArrayList<>();
        sedes.add("Brasilia");
        sedes.add("Caruaru");
        sedes.add("Recife");

        for (String item: sedes)
            System.out.println(sedes);

        sedes.add("arequipa");

        for (String item: sedes)
            System.out.println(sedes);
    }
}
