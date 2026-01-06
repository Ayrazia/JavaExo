package TD1;

public class Ex7 {
    public static void run() {
        System.out.println("-- Exercice 7 --");
        double prixHT = 100.0;
        double tva = 0.20;
        double montantTVA = prixHT * tva;
        double prixTTC = prixHT + montantTVA;
        System.out.println("Prix HT : " + prixHT + " €");
        System.out.println("TVA (20%) : " + montantTVA + " €");
        System.out.println("Prix TTC : " + prixTTC + " €\n");
    }
}

