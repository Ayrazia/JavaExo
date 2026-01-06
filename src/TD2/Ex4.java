package TD2;

public class Ex4 {
    public static void main() {
        System.out.println("-- TD2 Exercice 4 - Éligibilité à un prêt bancaire --");

        checkPret(1, 3000.0, false);
        checkPret(5, 2200.0, false);
        checkPret(3, 3500.0, true);

        System.out.println();
    }

    private static void checkPret(int ancienneteEmploi, double revenuMensuel, boolean incidents) {
        System.out.print("Profil => anciennete=" + ancienneteEmploi + ", revenu=" + revenuMensuel + ", incidents=" + incidents + " -> ");
        boolean ancienneteOk = ancienneteEmploi >= 2;
        boolean revenuOk = revenuMensuel >= 2500.0;
        boolean incidentsOk = !incidents;

        if (ancienneteOk && revenuOk && incidentsOk) {
            System.out.println("Prêt accordé – Profil validé");
        } else {
            System.out.println("Prêt refusé – Critères non satisfaits");
            if (!ancienneteOk) System.out.println("  - Ancienneté insuffisante");
            if (!revenuOk) System.out.println("  - Revenu insuffisant");
            if (!incidentsOk) System.out.println("  - Incidents de paiement récents");
        }
    }
}

