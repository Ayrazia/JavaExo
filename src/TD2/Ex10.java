package TD2;

import java.util.ArrayList;

public class Ex10 {
    public static void main() {
        System.out.println("-- TD2 Exercice 10 - Filtrage de données --");
        int[] indices = {45, 120, 78, 95, 150, 60, 200, 88, 110};
        int bon = 0, moyen = 0, mauvais = 0;
        ArrayList<Integer> over100 = new ArrayList<>();
        int total = 0;
        for (int idx : indices) {
            total += idx;
            if (idx < 50) bon++;
            else if (idx <= 100) moyen++;
            else { mauvais++; over100.add(idx); }
        }
        double moyenne = total / (double) indices.length;
        System.out.println("Bon : " + bon);
        System.out.println("Moyen : " + moyen);
        System.out.println("Mauvais : " + mauvais);
        System.out.println("Indices > 100 : " + over100);
        System.out.println("Indice moyen : " + moyenne + "\n");
    }
}

