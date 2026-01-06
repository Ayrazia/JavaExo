package TD2;

import java.util.ArrayList;
import java.util.Collections;

public class Ex15 {
    public static void main() {
        System.out.println("-- TD2 Exercice 15 - Tri de noms de clients --");
        ArrayList<String> clients = new ArrayList<>(java.util.Arrays.asList("Dupont", "Martin", "Bernard", "Dubois", "Lefebvre"));
        Collections.sort(clients);
        System.out.println("Tri croissant : " + clients);
        Collections.reverse(clients);
        System.out.println("Tri décroissant : " + clients + "\n");
    }
}

