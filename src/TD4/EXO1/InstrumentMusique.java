package TD4.EXO1;

public abstract class InstrumentMusique {
    String nom;
    String type;
    Double prix;

    public InstrumentMusique(Double prix, String type, String nom) {
        this.prix = prix;
        this.type = type;
        this.nom = nom;
    }

    public abstract void jouer();

    public abstract void accorder();

    public void afficheInfo() {
        System.out.println("Nom : " + nom + ", Type : " + type + ", Prix : " + prix);
    }

    public double calculerPrixAvecTVA() {
        return prix * 1.2;
    }


}
