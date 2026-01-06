package TD2;

import java.util.ArrayList;
import java.util.Arrays;

public class Ex14 {
    public static void main() {
        System.out.println("-- TD2 Exercice 14 - Fusion de deux listes --");
        ArrayList<String> tachesEquipe1 = new ArrayList<>(Arrays.asList("Tâche1", "Tâche2", "Tâche3"));
        ArrayList<String> tachesEquipe2 = new ArrayList<>(Arrays.asList("Tâche4", "Tâche5"));
        ArrayList<String> tachesGlobales = new ArrayList<>();
        tachesGlobales.addAll(tachesEquipe1);
        tachesGlobales.addAll(tachesEquipe2);
        System.out.println("Tâches globales : " + tachesGlobales);
        System.out.println("Contient 'Tâche3' ? " + tachesGlobales.contains("Tâche3") + "\n");
    }
}

