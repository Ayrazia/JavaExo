package ExoExemple;

public abstract class Vehicule {
    protected String marque;
    protected String modele;
    protected int vitesseActuelle;

    public Vehicule(String marque, String modele) {
        this.marque = marque;
        this.modele = modele;
        this.vitesseActuelle = 0;
    }
    public abstract void demarrer();

    public abstract void accelerer(int vitesse);

    public void arreter() {
        this.vitesseActuelle = 0;
        System.out.println(marque + " " + modele + " s'arrête.");
    } public void afficherInfo() {
        System.out.println("Véhicule : " + marque + " " +
                modele);
        System.out.println("Vitesse actuelle : " +
                vitesseActuelle + " km/h"); }
}

