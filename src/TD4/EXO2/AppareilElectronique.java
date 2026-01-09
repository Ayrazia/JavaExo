package TD4.EXO2;

public abstract class AppareilElectronique {
    protected String marque;
    protected String modele;
    protected double prix;

    public AppareilElectronique(String marque, String modele, double prix) {
        this.marque = marque;
        this.modele = modele;
        this.prix = prix;
    }

    public abstract void allumer();

    public void afficherCaracteristiques() {
        System.out.println("Marque : " + marque + ", Modele : " + modele + ", Prix : " + prix);
    }
}
