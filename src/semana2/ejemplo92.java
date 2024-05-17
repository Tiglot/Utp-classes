package semana2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ejemplo92 {
    public static void main(String[] args){
        /*String nombre1, nombre2;
        nombre1 = "tom";
        nombre2 = "tom";

        System.out.println("nombre1 = nombre2: " + nombre1.equals(nombre2) );

        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        Cancion c1 = new Cancion("robocop gay", "mamonas", 500, Cancion.Genero.ROCK,
                LocalDate.parse("01/02/1054", dateFormat));

        Cancion c2 = new Cancion("robocop gay", "mamonas", 500, Cancion.Genero.ROCK,
                LocalDate.parse("01/02/1054", dateFormat));

        System.out.println("cancion 1 equal cancion 2: " + c1.equals(c2) );

        String num1, num2, num3;
        num1 = "32";
        num2 = "50";
        num3 = "32";

        //compareto returns -2, 2 or 0, lesser, greater or equals
        System.out.println("num1 compara a num2:  " + num1.compareTo(num2));
        System.out.println("num1 compara a num2:  " + num2.compareTo(num1));
        System.out.println("num1 compara a num2:  " + num1.compareTo(num3));

        //gotta implement the comparable shit
        System.out.println("cancion1 compara a cancion2:  " + c1.compareTo(c2));

         */
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        Cancion[] catalogo = {
            new Cancion("robocop gay", "mamonas", 500, Cancion.Genero.ROCK,
                    LocalDate.parse("01/02/1054", dateFormat)),
            new Cancion("acima do sol", "skank", 500, Cancion.Genero.POP,
                    LocalDate.parse("01/02/2004", dateFormat)),
            new Cancion("playa", "capo", 441, Cancion.Genero.SALSA,
                    LocalDate.parse("01/11/2013", dateFormat)),
            new Cancion("pelados em santos", "mamonas", 330, Cancion.Genero.ROCK,
                        LocalDate.parse("14/10/2050", dateFormat)),
            new Cancion("ainda gosto dela", "skank", 400, Cancion.Genero.POP,
                        LocalDate.parse("31/07/2005", dateFormat)),
            new Cancion("Tempo perdido", "legião urbana", 441, Cancion.Genero.URBANO,
                        LocalDate.parse("01/11/1998", dateFormat)),
        };

        System.out.println("\nCanciones desordenadas:");
        for (Cancion item:catalogo)
            System.out.println(item);

        System.out.println("\nCanciones ordenadas:");
        Ordena.quickSort(catalogo);

        for (Cancion item:catalogo)
            System.out.println(item);
    }
}

