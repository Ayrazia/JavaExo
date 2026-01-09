package TD4.EXO2;

public class Tablette extends AppareilElectronique implements Portable, Rechargeable{
    byte batterie;
    double poids;

    public Tablette(String marque, String modele, double prix, byte batterie, double poids) {
        super(marque, modele, prix);
        this.batterie = batterie;
        this.poids = poids;
    }


    @Override
    public void allumer() {
        System.out.println("La tablette fonctionne et s'allume");
    }

    @Override
    public double getPoids() {
        return poids;
    }

    @Override
    public void afficherPortabilite() {
        if (poids < 1000) {
            System.out.println("La tablette est facilement portable");
        } else if (poids <= 2000 && poids >= 1000) {
            System.out.println("La tablette commence a être lourde pour la portabilité");
        } else if (poids > 2000) {
            System.out.println("La tablette est difficilement portable");

        }
    }

    @Override
    public void recharger() {
        batterie = 100;
        System.out.println("La tablette est en train de se recharger");
    }

    @Override
    public int getNiveauBatterie() {
        return batterie;
    }

    @Override
    public void afficherBatterie() {
        System.out.println(batterie + "%");
    }
}
