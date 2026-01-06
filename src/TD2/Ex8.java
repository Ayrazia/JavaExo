package TD2;

import java.util.ArrayList;

public class Ex8 {
    public static void main() {
        System.out.println("-- TD2 Exercice 8 - Relevé de températures --");
        int[] temps = {15, 18, 12, 22, 19, 24, 16};
        int min = temps[0], max = temps[0];
        ArrayList<Integer> over20 = new ArrayList<>();
        for (int t : temps) {
            if (t < min) min = t;
            if (t > max) max = t;
            if (t > 20) over20.add(t);
        }
        System.out.println("Température minimale : " + min + "°C");
        System.out.println("Température maximale : " + max + "°C");
        System.out.print("Jours > 20°C : ");
        for (int i = 0; i < over20.size(); i++) {
            System.out.print(over20.get(i) + (i + 1 < over20.size() ? ", " : ""));
        }
        System.out.println();
        System.out.println("Écart de température : " + (max - min) + "°C\n");
    }
}

