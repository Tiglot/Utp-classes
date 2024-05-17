package semana4;

public class Copiado {
    public static void main(String[] args) {

        // Copiado de elementos

        // 1. Copie los 3 ultimos elementos de data al array graduados con el metodo System.arraycopy
                 // idx => 0      1     2       3       4
        String[] data = {"Juan","Ana","Rosa","Carlos","Luis"};
        String[] graduados = new String[5];
        graduados[0] = "Juan"; graduados[1] = "Ana";

        System.arraycopy(data,2, graduados, 2, data.length-2);
        assert (graduados[2].equals("Rosa")) : "No existe el elemento Rosa";
        assert (graduados[3].equals("Carlos")) : "No existe el elemento Carlos";
        assert (graduados[4].equals("Luis")) : "No existe el elemento Luis";
        System.out.println("EXERCICIO 1 SUCESSO");
        // 2. Copiar el array notas en el array registro
        int[] notas = {15,14,16,18};
        int[] registro = new int[6];
        System.arraycopy(notas, 0, registro, 0, notas.length);
        assert (registro[0] == 15) : "No existe el elemento 15";
        assert (registro[1] == 14) : "No existe el elemento 14";
        assert (registro[2] == 16) : "No existe el elemento 16";
        assert (registro[3] == 18) : "No existe el elemento 18";

        System.out.println("Programa finalizado correctamente");

    }
}
