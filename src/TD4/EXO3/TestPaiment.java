package TD4.EXO3;

public class TestPaiment {
    public static void main(String[] args) {
        MoyenPaiement[] paiments = new MoyenPaiement[3];
        paiments[0] = new CarteBancaire("1234-5678-9012-3456", "Alice", 1000.0);
        paiments[1] = new PayPal("Bob", 500.0,"to@to.to");
        paiments[2] = new Crypto("Charlie", 200.0, "WALLET123");

        Double montantAPayer = 150.0;
        for (MoyenPaiement p : paiments) {
            if (p.payer(montantAPayer)) {
                System.out.println(p.titulaire);
                p.effectuerPaiement(montantAPayer);
                p.effectuerPaiement(montantAPayer, "Paiment pour le fun");
                p.effecuterPaiement(montantAPayer, "Parce que c'est comme sa ", 0.02);
                p.afficherSolde();
                System.out.println("-------------------------------------------------");
            }

        }



    }

}
