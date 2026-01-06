package TD2;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> notes = new ArrayList<>();

        boolean running = true;
        while (running) {
            printMenu();
            System.out.print("Votre choix : ");
            String line = scanner.nextLine().trim();
            int choix;
            try {
                choix = Integer.parseInt(line);
            } catch (NumberFormatException e) {
                System.out.println("Choix invalide. Entrez un nombre entre 1 et 6.\n");
                continue;
            }

            switch (choix) {
                case 1:
                    ajouterNote(scanner, notes);
                    break;
                case 2:
                    supprimerNote(scanner, notes);
                    break;
                case 3:
                    afficherNotes(notes);
                    break;
                case 4:
                    double m = calculerMoyenne(notes);
                    if (notes.isEmpty()) System.out.println("Aucune note présente. Impossible de calculer la moyenne.\n");
                    else System.out.printf("La moyenne est : %.2f\n\n", m);
                    break;
                case 5:
                    notesSuperieures(notes);
                    break;
                case 6:
                    running = false;
                    System.out.println("Quitter. Au revoir !");
                    break;
                default:
                    System.out.println("Choix invalide. Entrez un nombre entre 1 et 6.\n");
            }
        }

        scanner.close();
    }

    private static void printMenu() {
        System.out.println("=== GESTION DES NOTES ===");
        System.out.println("1. Ajouter une note");
        System.out.println("2. Supprimer une note");
        System.out.println("3. Afficher toutes les notes");
        System.out.println("4. Calculer la moyenne");
        System.out.println("5. Afficher notes > moyenne");
        System.out.println("6. Quitter");
    }

    private static void ajouterNote(Scanner scanner, ArrayList<Double> notes) {
        System.out.print("Entrez la note (0.0 - 20.0) : ");
        String line = scanner.nextLine().trim();
        double value;
        try {
            value = Double.parseDouble(line);
        } catch (NumberFormatException e) {
            System.out.println("Valeur invalide. La note doit être un nombre.\n");
            return;
        }
        if (value < 0.0 || value > 20.0) {
            System.out.println("Note hors plage. Entrez une valeur entre 0 et 20.\n");
            return;
        }
        notes.add(value);
        System.out.println("Note ajoutée : " + value + "\n");
    }

    private static void supprimerNote(Scanner scanner, ArrayList<Double> notes) {
        if (notes.isEmpty()) {
            System.out.println("Aucune note à supprimer.\n");
            return;
        }
        afficherNotes(notes);
        System.out.print("Entrez l'index de la note à supprimer (0 - " + (notes.size() - 1) + ") : ");
        String line = scanner.nextLine().trim();
        int idx;
        try {
            idx = Integer.parseInt(line);
        } catch (NumberFormatException e) {
            System.out.println("Index invalide. Opération annulée.\n");
            return;
        }
        if (idx < 0 || idx >= notes.size()) {
            System.out.println("Index hors limites. Opération annulée.\n");
            return;
        }
        double removed = notes.remove(idx);
        System.out.println("Note supprimée : " + removed + "\n");
    }

    private static void afficherNotes(ArrayList<Double> notes) {
        if (notes.isEmpty()) {
            System.out.println("Aucune note enregistrée.\n");
            return;
        }
        System.out.println("Liste des notes :");
        for (int i = 0; i < notes.size(); i++) {
            System.out.printf("%d : %.2f\n", i, notes.get(i));
        }
        System.out.println();
    }

    private static double calculerMoyenne(ArrayList<Double> notes) {
        if (notes.isEmpty()) return 0.0;
        double s = 0.0;
        for (double n : notes) s += n;
        return s / notes.size();
    }

    private static void notesSuperieures(ArrayList<Double> notes) {
        if (notes.isEmpty()) {
            System.out.println("Aucune note présente.\n");
            return;
        }
        double m = calculerMoyenne(notes);
        System.out.printf("Moyenne = %.2f\n", m);
        System.out.print("Notes supérieures à la moyenne : ");
        boolean any = false;
        for (double n : notes) {
            if (n > m) {
                System.out.print(String.format("%.2f ", n));
                any = true;
            }
        }
        if (!any) System.out.print("(aucune)");
        System.out.println("\n");
    }
}