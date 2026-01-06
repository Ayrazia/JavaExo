package TD2;

import java.util.ArrayList;
import java.util.Collections;

public class Ex17 {
    public static void main() {
        System.out.println("-- TD2 Exercice 17 - Tri de notes et médiane --");
        ArrayList<Double> notes = new ArrayList<>(java.util.Arrays.asList(14.5, 8.0, 16.0, 10.5, 12.0, 9.5, 18.0, 11.5));
        System.out.println("Avant tri : " + notes);
        Collections.sort(notes);
        System.out.println("Après tri : " + notes);
        double mediane;
        int n = notes.size();
        if (n % 2 == 0) {
            mediane = (notes.get(n/2 - 1) + notes.get(n/2)) / 2.0;
        } else {
            mediane = notes.get(n/2);
        }
        System.out.println("Médiane : " + mediane + "\n");
    }
}

