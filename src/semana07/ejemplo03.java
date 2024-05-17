package semana07;

import java.util.Arrays;
import java.util.LinkedList;

public class ejemplo03  {
    public static void main(String[] args)
    {
        LinkedList<Integer> lista = new LinkedList<>(
                Arrays.asList(10, 2, 4, 5, 6, 7)
        );

        lista.addFirst(15);
        for (Integer item: lista){
            System.out.print(item);
            System.out.print(", ");
        }
        System.out.println(" ");
        lista.addLast(40);
        for (Integer item: lista){
            System.out.print(item);
            System.out.print(", ");
        }
        System.out.println(" ");
        lista.add(1, 99);
        for (Integer item: lista){
            System.out.print(item);
            System.out.print(", ");
        }
        System.out.println(" ");
        LinkedList<Integer> lista2 = new LinkedList<>(
                Arrays.asList(999, 111)
        );
        lista.addAll(2, lista2);
        for (Integer item: lista){
            System.out.print(item);
            System.out.print(", ");
        }
    }
}
