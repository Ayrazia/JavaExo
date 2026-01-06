package TD2;

import java.util.ArrayList;

public class Ex19 {
    public static void main() {
        System.out.println("-- TD2 Exercice 19 - Gestion de stock avancé (exemple) --");
        ArrayList<String> nomsProduits = new ArrayList<>();
        ArrayList<Integer> quantites = new ArrayList<>();
        ArrayList<Double> prix = new ArrayList<>();
        nomsProduits.add("Ordinateur"); quantites.add(5); prix.add(800.0);
        nomsProduits.add("Souris"); quantites.add(20); prix.add(15.0);
        nomsProduits.add("Clavier"); quantites.add(10); prix.add(25.0);
        System.out.println("ID Nom Quantité Prix unitaire Valeur stock");
        for (int i = 0; i < nomsProduits.size(); i++) {
            double valeur = quantites.get(i) * prix.get(i);
            System.out.printf("%d %s %d %.2f € %.2f €%n", i, nomsProduits.get(i), quantites.get(i), prix.get(i), valeur);
        }
        double total = 0; for (int i = 0; i < nomsProduits.size(); i++) total += quantites.get(i) * prix.get(i);
        System.out.println("Valeur totale du stock : " + total + " €");
        System.out.print("Produits en rupture : ");
        for (int i = 0; i < nomsProduits.size(); i++) if (quantites.get(i) == 0) System.out.print(nomsProduits.get(i) + " ");
        System.out.println("\n");
    }
}

