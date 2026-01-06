package TD2;

import java.util.Arrays;

public class Ex6 {
    public static void main() {
        System.out.println("-- TD2 Exercice 6 - Gestion des stocks --");
        int[] quantites = {45, 12, 78, 5, 60, 23};
        System.out.println("Quantité premier produit : " + quantites[0]);
        System.out.println("Quantité dernier produit : " + quantites[quantites.length - 1]);
        quantites[3] = 50;
        System.out.println("Tableau après modification : " + Arrays.toString(quantites));
        System.out.println();
    }
}

