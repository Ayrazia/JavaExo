package TD4.EXO2;

public class Smartphone extends AppareilElectronique implements Portable, Rechargeable, Connecte{
    byte batterie;
    double poids;
    boolean wifiActive;
    String nomReseau;


    public Smartphone(String marque, String modele, double prix, byte batterie, double poids, boolean wifiActive, String reseau) {
        this.batterie = batterie;
        this.poids = poids;
        this.wifiActive = wifiActive;
        this.nomReseau = "";
        super(marque, modele, prix);
    }

    @Override
    public void allumer() {
        System.out.println("Le smartphone fonctionne et s'allume");
    }


    @Override
    public void connecterWifi(String reseaux) {
        wifiActive = true;
        System.out.println("Vous êtes bien connecter a la wifi : " + reseaux);

    }

    @Override
    public void deconnecter() {
        wifiActive = false;
        System.out.println("Vous vous êtes bien déconnecter de la wifi");

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
        if (poids < 400) {
        System.out.println("Le smartphone est facilement portable");
    } else if (poids <= 800 && poids >= 400) {
            System.out.println("Le smartphone commence a être lourd pour la portabilité");
        } else if (poids > 800) {
            System.out.println("Le smartphone est difficilement portable");
        }
    }

    @Override
    public void recharger() {
        batterie = 100;
        System.out.println("Le smartphone est en train de se recharger");
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
