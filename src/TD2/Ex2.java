package TD2;

public class Ex2 {
    public static void main() {
        System.out.println("-- TD2 Exercice 2 - Calcul de remise commerciale --");
        double[] tests = {50.0, 150.0, 350.0, 600.0};
        for (double montant : tests) {
            double taux = 0.0;
            if (montant >= 500.0) {
                taux = 0.20;
            } else if (montant >= 300.0) {
                taux = 0.15;
            } else if (montant >= 100.0) {
                taux = 0.10;
            } else {
                taux = 0.0;
            }
            double finalAmount = montant * (1.0 - taux);
            System.out.printf("Montant initial : %.2f €, Remise appliquée : %.0f%%, Montant final : %.2f €%n", montant, taux * 100, finalAmount);
        }
        System.out.println();
    }
}

