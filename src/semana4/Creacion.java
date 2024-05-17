package semana4;

public class Creacion {
    public static void main(String[] args) {

        // Arrays con inicializadores

        // 1. Crear el array notas de tipo int con 4 notas inicializadas
        int[] notas = {2, 3, 4, 5};

        // 2. Crear el array alumnos de tipo String con 3 alumnos inicializados
        String[] alumnos = {"pEDRO", "JUAN", "RAMON", "CLAEA", "ESCOBAR"};
        // 3. Crear el array score de tipo int con 5 valores inicializados
        int[] score = {2, 3, 4, 5, 6};

        // 4. Crear el array cantidad de tipo float con 2 valores inicializados desde variables
        float a = 6.7f;
        float b =7.5f;

        float[] cantidad = {a, b};

        // Arrays con new

        // 5. Crear el array devices de tipo String con una capacidad de 5 elementos
        String[] devices = new String[5];

        // 6. Crear el array letras de tipo char con una capacidad de 15 elementos
        char[] letras = new char[15];

        // 7. Crear el array canciones de tipo Song con una capacidad de 10 elementos
        Song[] canciones = new Song[10];
    }
}
