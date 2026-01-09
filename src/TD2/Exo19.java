package TD2;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Exo19 {
    public static void main(String[] args) {
        ArrayList<String> nomsProduits = new ArrayList<>();
        ArrayList<Double> prixUnitaire = new ArrayList<>();
        ArrayList<Integer> quantites = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        boolean continuer = true;
        while (continuer) {
            System.out.println("\n--- Menu Gestion de Stock ---");
            System.out.println("1. Ajouter un produit");
            System.out.println("2. Afficher les stocks");
            System.out.println("3. Rechercher un produit par nom");
            System.out.println("4. Mise a jour des quantité");
            System.out.println("5. Calculer la valeur totale du stock");
            System.out.println("6. Afficher les produits en rupture de stock");
            System.out.println("7. Quitter");
            System.out.print("Choix : ");

            int choix = sc.nextInt();
            sc.nextLine();

            switch (choix) {
                case 1:
                    System.out.println("Nom du produit :");
                    nomsProduits.add(sc.nextLine());
                    System.out.println("Prix unitaire :");
                    prixUnitaire.add(sc.nextDouble());
                    System.out.println("Quantité initiale :");
                    quantites.add(sc.nextInt());
                    break;
                case 2:
                    if (nomsProduits.isEmpty()) {
                        System.out.println("Le stock est vide.");
                        break;
                    }

                    System.out.printf("%-3s %-20s %-10s %-12s %-12s%n", "ID", "Nom", "Quantité", "Prix unitaire", "Valeur stock");
                    System.out.println("---------------------------------------------------------------");

                    for (int i = 0; i < nomsProduits.size(); i++) {
                        double valeur = quantites.get(i) * prixUnitaire.get(i);
                        System.out.printf("%-3d %-20s %-10d %-12.2f %-12.2f%n", i, nomsProduits.get(i), quantites.get(i), prixUnitaire.get(i), valeur);
                    }

                    break;
                case 3:
                    System.out.println("Nom du produit à rechercher :");
                    String nomRecherche = sc.nextLine();
                    boolean trouve = false;
                    for (int i = 0; i < nomsProduits.size(); i++) {
                        if (nomsProduits.get(i).equalsIgnoreCase(nomRecherche)) {
                            double valeur = quantites.get(i) * prixUnitaire.get(i);
                            System.out.printf("Produit trouvé - ID: %d, Nom: %s, Quantité: %d, Prix: %.2f, Valeur: %.2f%n",
                                    i, nomsProduits.get(i), quantites.get(i), prixUnitaire.get(i), valeur);
                            trouve = true;
                            break;
                        }
                    }
                    if (!trouve) {
                        System.out.println("Produit non trouvé.");
                    }
                    break;
                case 4:
                    if (nomsProduits.isEmpty()) {
                        System.out.println("Le stock est vide.");
                        break;
                    }

                    System.out.printf("%-3s %-20s %-10s %-12s %-12s%n", "ID", "Nom", "Quantité", "Prix unitaire", "Valeur stock");
                    System.out.println("---------------------------------------------------------------");

                    for (int i = 0; i < nomsProduits.size(); i++) {
                        double valeur = quantites.get(i) * prixUnitaire.get(i);
                        System.out.printf("%-3d %-20s %-10d %-12.2f %-12.2f%n",
                                i, nomsProduits.get(i), quantites.get(i), prixUnitaire.get(i), valeur);
                    }

                    System.out.println("Quelle produit voulez vous mettre a jour (entrez l'ID) ?");
                    int idProduit = sc.nextInt();
                    if (idProduit < 0 || idProduit >= nomsProduits.size()) {
                        System.out.println("ID invalide.");
                    }
                    System.out.println("Saisissez la quantité a mettre a jour :");
                    quantites.set(idProduit, sc.nextInt());
                    sc.nextLine();
                    break;

                case 5:
                    double valeurTotal = 0;
                    for (int i = 0; i < nomsProduits.size(); i++) {
                        valeurTotal += quantites.get(i) * prixUnitaire.get(i);

                    }
                    System.out.println("La valeur totale du stock est de : " + valeurTotal);

                    break;

                case 6:
                    boolean rupture = false;
                    for (int i = 0; i < nomsProduits.size(); i++) {
                        if (quantites.get(i) <= 0) {
                            System.out.println("Produit en rupture de stock : " + nomsProduits.get(i));
                            rupture = true;
                        }
                    }
                    if (!rupture) {
                        System.out.println("Aucun produit en rupture de stock.");
                    }
                    break;

                case 7:
                    continuer = false;
                    System.out.println("Au revoir !");
                    break;

                default:
                    System.out.println("Choix invalide");
                    break;
            }
        }
        sc.close();
    }
}