package semana4;

import java.util.ArrayList;
import java.util.Arrays;

public class Eliminacion {

    public static void main(String[] args) {

        // Eliminacion de datos

        // 1. Usando el metodo remove de la clase ArrayList, elimina a Juan y Rosa
        ArrayList<String> data = new ArrayList(
                Arrays.asList("Juan","Ana","Rosa","Carlos"));
        data.remove(0);
        data.remove(1);

        assert (data.get(0) == "Ana") : "El primer elemento no es Ana";
        assert (data.get(1) == "Carlos") : "El segundo elemento no es Carlos";

        // 2. Elimina el elemento Carlos
        data.remove(1);
        assert (data.get(0) == "Ana" && data.size()==1) : "El único elemento no es Ana";

        System.out.println("Programa finalizado correctamente");
    }
}
