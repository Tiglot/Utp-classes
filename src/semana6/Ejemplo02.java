package semana6;

import java.util.ArrayList;

public class Ejemplo02 {
    public static void main(String[] args)
    {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(20);
        lista.add(30);
        lista.add(40);

        //obter tamanho da lista
        int tamanho = lista.size();
        System.out.println(tamanho);

        //comprobar se la lista tiene elementos
        boolean hay_elemento = lista.isEmpty();
        System.out.println("La lista no tiene elementos:" + hay_elemento);

        //elemento 100 esta en lista
        boolean hay_100 = lista.contains(100);
        System.out.println("Tiene elemento 100:" + hay_100);
    }
}
