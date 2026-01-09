package TD4.EXO3;

public abstract class MoyenPaiement {

    protected String titulaire;
    protected Double solde;

    public MoyenPaiement(String titulaire, Double solde) {
        this.titulaire = titulaire;
        this.solde = solde;
    }

    public abstract boolean payer(Double montant);

    public abstract String getTypePaiement();

    public void afficherSolde() {
        System.out.println("Solde à jour: " + solde);
    }

    public boolean verifierSolde(Double montant) {
        return solde >= montant;
    }

    public void effectuerPaiement(Double montant) {
        System.out.println(montant);
    }

    public void effectuerPaiement(Double montant, String description) {
        System.out.println(montant + " - " + description);
    }

    public void effecuterPaiement(Double montant, String description, Double commission) {
        System.out.println(montant + " - " + description + " - " + commission);
    }
}
