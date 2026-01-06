package TD2;

public class Ex5 {
    public static void main() {
        System.out.println("-- TD2 Exercice 5 - Catégorisation de produits --");
        String[] codeProduit = {"AL", "EL", "XX"};
        for (String code : codeProduit) {
            String categorie;
            double tva;
            switch (code) {
                case "AL":
                    categorie = "Alimentation";
                    tva = 5.5;
                    break;
                case "EL":
                    categorie = "Électronique";
                    tva = 20.0;
                    break;
                case "VT":
                    categorie = "Vêtements";
                    tva = 20.0;
                    break;
                case "MB":
                    categorie = "Meubles";
                    tva = 20.0;
                    break;
                case "LV":
                    categorie = "Livres";
                    tva = 5.5;
                    break;
                default:
                    categorie = "Catégorie inconnue";
                    tva = 0.0;
            }
            System.out.printf("Code=%s -> Catégorie : %s, TVA = %.1f%% %n", code, categorie, tva);
        }
        System.out.println();
    }
}

