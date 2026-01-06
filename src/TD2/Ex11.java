package TD2;

import java.util.ArrayList;

public class Ex11 {
    public static void main() {
        System.out.println("-- TD2 Exercice 11 - Bibliothèque de cours (ArrayList) --");
        ArrayList<String> cours = new ArrayList<>();
        cours.add("Mathématiques");
        cours.add("Programmation Java");
        cours.add("Base de données");
        cours.add("Algorithmique");
        cours.add("Réseaux");
        cours.add("Anglais");
        System.out.println("Liste complète : " + cours);
        cours.remove("Base de données");
        System.out.println("Après suppression (size) : " + cours.size());
        System.out.println("Contient 'Algorithmique' ? " + cours.contains("Algorithmique") + "\n");
    }
}

