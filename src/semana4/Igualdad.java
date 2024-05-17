package semana4;

import java.util.ArrayList;
import java.util.Arrays;

public class Igualdad {

    public static void main(String[] args) {

        // 1. Comparar los arrasys usando el método equals de la clase ArrayList
        ArrayList<String> data = new ArrayList<>(
                Arrays.asList("Juan","Ana","Rosa"));

        ArrayList<String> info = new ArrayList<>(
                Arrays.asList("Juan","Ana","Rosa"));

        boolean resultado = false;
        resultado = data.equals(info);
        assert (resultado == true): "Los arrays no son iguales";

        System.out.println("Programa finalizado correctamente");

    }
}
