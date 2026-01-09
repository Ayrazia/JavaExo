package TD4.EXO3;

public class PayPal extends MoyenPaiement {

    String email;

    public PayPal(String titulaire, Double solde, String email) {
        super(titulaire, solde);
        this.email = email;
    }

    @Override
    public boolean payer(Double montant) {
        double commission = montant * 0.02;
        if (solde >= (montant + commission)) {
            solde -= montant + commission;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String getTypePaiement() {
        return "PayPal";
    }
}
