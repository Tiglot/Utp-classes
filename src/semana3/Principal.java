package semana3;

public class Principal {
    public static void main(String[] args){
        Asignatura[] malla = {
                new Asignatura("C1", 1, "Mecãnica geral", 5),
                new Asignatura("C5", 5, "Cálculo", 6),
                new Asignatura("C3", 3, "Usinagem", 8),
                new Asignatura("C7", 7, "Pneumática", 2),
                new Asignatura("C20", 20, "Programação", 4),
                new Asignatura("C12", 12, "Algebra linear", 6),
        };
        System.out.println("Dados originais");
        for (Asignatura item:malla)
            System.out.println(item);

        Ordena.bubbleSort(malla);
        System.out.println("\nDados originais depois do bubble sort");
        for (Asignatura item:malla)
            System.out.println(item);
    }
}
