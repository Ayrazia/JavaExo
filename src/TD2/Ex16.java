package TD2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex16 {
    public static void main() {
        System.out.println("-- TD2 Exercice 16 - Conversion Liste ↔ Tableau --");
        List<String> pays = new ArrayList<>(Arrays.asList("France", "Allemagne", "Italie", "Espagne"));
        String[] tableau = pays.toArray(new String[0]);
        System.out.println("Tableau : ");
        for (int i = 0; i < tableau.length; i++) System.out.println(tableau[i]);
        for (int i = 0; i < tableau.length; i++) if ("Italie".equals(tableau[i])) tableau[i] = "Belgique";
        List<String> nouvelle = Arrays.asList(tableau);
        System.out.println("Nouvelle liste : " + nouvelle + "\n");
    }
}

