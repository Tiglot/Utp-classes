package semana6;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int select = -1;
        ArrayList<Song> canciones = new ArrayList<>();

        while (select != 0)
        {
            try{
                System.out.print("1.- Agrega a la Lista" +
                        "\n2.- Ordena\n" +
                        "3.- Busca\n" +
                        "4.- Muestra\n" +
                        "0.- Salir\n" + "Elige opción:" );

                select = scanner.nextInt();

                switch (select)
                {
                    case 1:
                        System.out.println("\nEnter the artist name:");
                        String name = scanner.next();

                        System.out.println("\nEnter the song name:");
                        String titulo = scanner.next();
                        canciones.add(new Song(name, titulo));
                        break;
                    case 2:
                        canciones.sort(Comparator.naturalOrder());
                        break;
                    case 3:
                        System.out.println("Nome da música:");
                        String busca = scanner.next();
                        int p=-1;
                        for(int i = 0;i<canciones.size();i++){
                            if(canciones.get(i).getTitulo().equalsIgnoreCase(busca)){
                                p=i;
                            }
                        }
                        if(p>=0)
                            System.out.println("Si se encuentra:" + canciones.get(p));
                        else
                            System.out.println("No se encuentra:");
                        break;
                    case 4:
                        for (Song item: canciones)
                            System.out.println(item);
                        break;
                    case 0:
                        System.out.println("Adios");
                        break;
                    default:
                        System.out.println("Numero não reconhecido");
                        break;
                }
                System.out.println("\n");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}
