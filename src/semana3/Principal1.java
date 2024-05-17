package semana3;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Principal1 {
    public static int totallineas( File ff){
        FileReader fr;
        try {
            fr = new FileReader(ff);
            BufferedReader br = new BufferedReader(fr);
            return (int)br.lines().count();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Principal1.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    public static void main(String[] args){
        File f = new File("C:\\Users\\55819\\IdeaProjects\\UTP algoritmos\\src\\semana3\\cursos.txt");
        int t = totallineas(f);
        System.out.println(t);

        Asignatura[] malla = new Asignatura[t];
        int c = 0;
        try {
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            String linea1 = br.readLine();
            while(linea1 != null)
            {
                for(int i = 0; i<linea1.length()-1; i++)
                {
                    String[] linea = linea1.split(",");
                    String codigo = linea[0];
                    int ciclo = Integer.parseInt(linea[1]);
                    String nombre = linea[2];
                    int creditos = Integer.parseInt(linea[3]);
                    malla[c] = new Asignatura(codigo, ciclo, nombre, creditos);
                }
                c++;
                linea1 = br.readLine();
            }
            fr.close();
            System.out.println("Dados originales");
            for (Asignatura item:malla)
                System.out.println(item);

            Ordena.bubbleSort(malla);
            System.out.println("\nDados originais depois do bubble sort");
            for (Asignatura item:malla)
                System.out.println(item);

            Asignatura a1 = new Asignatura("100000N08I");

            int idx = SearchUTP.linearSearch(malla, a1);
            if (idx<0)
                System.out.println("Não tem esse código");
            else
                System.out.println("\n" + malla[idx]);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }}
