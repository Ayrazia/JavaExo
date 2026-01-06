package TD2;

public class Ex3 {
    public static void main() {
        System.out.println("-- TD2 Exercice 3 - Système de navigation (switch) --");
        int[] tests = {1, 3, 5, 10};
        for (int choixMenu : tests) {
            System.out.print("Choix = " + choixMenu + " -> ");
            switch (choixMenu) {
                case 1:
                    System.out.println("Consulter les statistiques");
                    break;
                case 2:
                    System.out.println("Exporter les données");
                    break;
                case 3:
                    System.out.println("Importer un fichier");
                    break;
                case 4:
                    System.out.println("Paramètres");
                    break;
                default:
                    System.out.println("Erreur : option invalide");
            }
        }
        System.out.println();
    }
}

