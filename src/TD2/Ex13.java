package TD2;

import java.util.ArrayList;

public class Ex13 {
    public static void main() {
        System.out.println("-- TD2 Exercice 13 - File d'attente dynamique --");
        ArrayList<String> fileAttente = new ArrayList<>();
        fileAttente.add("Client_A");
        fileAttente.add("Client_B");
        fileAttente.add("Client_C");
        fileAttente.add("Client_D");
        fileAttente.add("Client_E");
        System.out.println("File initiale : " + fileAttente);
        String traite = fileAttente.remove(0);
        System.out.println("Client traité : " + traite);
        System.out.println("File après traitement : " + fileAttente);
        fileAttente.add("Client_F");
        System.out.println("Après ajout Client_F : " + fileAttente);
        System.out.println("Position actuelle de Client_D : " + (fileAttente.indexOf("Client_D") + 1));
        System.out.println("Nombre total de clients : " + fileAttente.size() + "\n");
    }
}

