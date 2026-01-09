package TD4.EXO3;

public class CarteBancaire extends MoyenPaiement {

    String numeroCarte;

    public CarteBancaire(String numeroCarte, String titulaire, Double solde) {
        super(titulaire, solde);
        this.numeroCarte = numeroCarte;
    }

    @Override
    public boolean payer(Double montant) {
        if (solde >= montant) {
            solde -= montant;
            return true;
        } else {
            return false;
        }

    }

    @Override
    public String getTypePaiement() {
        return "Carte bancaire";
    }

}
