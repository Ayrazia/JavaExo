package TD4.EXO2;

public class OrdinateurPortable extends AppareilElectronique implements Portable, Rechargeable, Connecte{
    byte batterie;
    double poids;
    boolean wifiActive;
    String reseau;

    public OrdinateurPortable(String marque, String modele, double prix, byte batterie, double poids, boolean wifiActive, String reseau) {
        super(marque, modele, prix);
        this.batterie = batterie;
        this.poids = poids;
        this.wifiActive = wifiActive;
        this.reseau = reseau;
    }


    @Override
    public void allumer() {
        System.out.println("L'ordinateur fonctionne et s'allume");
    }

    @Override
    public void connecterWifi(String reseau) {
        wifiActive = true;
        System.out.println("L'ordinateur est connecter a la wifi : " + reseau );
    }

    @Override
    public void deconnecter() {
        wifiActive = false;
        System.out.println("L'ordinateur est bien déconnecter de la wifi");
    }

    @Override
    public boolean estConnecte() {
        return wifiActive;
    }

    @Override
    public double getPoids() {
        return poids;
    }

    @Override
    public void afficherPortabilite() {
        if (poids < 1500) {
            System.out.println("L'ordinateur est facilement portable");
        } else if (poids <= 2500 && poids >= 1500) {
            System.out.println("L'ordinateur commence a être lourd pour la portabilité");
        } else if (poids > 2500) {
            System.out.println("L'ordinateur est difficilement portable");
        }
    }

    @Override
    public void recharger() {
        batterie = 100;
        System.out.println("L'ordinateur est en train de se recharger");
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
