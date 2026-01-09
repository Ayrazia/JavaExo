package TD4.EXO3;

public class Crypto extends MoyenPaiement{

    String codeWallet;

    public Crypto(String titulaire, Double solde, String codeWallet) {
        super(titulaire, solde);
        this.codeWallet = codeWallet;
    }

    @Override
    public boolean payer(Double montant) {
        double commission = montant * 0.01;
        if (solde >= (montant + commission)) {
            solde -= montant + commission;
            System.out.println("Transaction réussite et effectuer de : " + codeWallet);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String getTypePaiement() {
        return "Cryptomonnaie";
    }
}
