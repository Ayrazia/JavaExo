package TD2;

import java.util.ArrayList;

public class Ex12 {
    public static void main() {
        System.out.println("-- TD2 Exercice 12 - Manipulation de scores --");
        ArrayList<Integer> scores = new ArrayList<>();
        scores.add(1200); scores.add(950); scores.add(1450); scores.add(800); scores.add(1600);
        System.out.println("Contient 950 ? " + scores.contains(950));
        System.out.println("Index de 1450 : " + scores.indexOf(1450));
        scores.set(scores.indexOf(800), 1000);
        System.out.println("Liste mise à jour : " + scores);
        System.out.println("Premier score : " + scores.get(0) + ", Dernier score : " + scores.get(scores.size() - 1) + "\n");
    }
}

