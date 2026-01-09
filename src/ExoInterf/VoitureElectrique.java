package ExoInterf;

class VoitureElectrique implements Vehicule, Electrique {
    private String modele;
    private int vitesse;
    private int batterie;
    private boolean enMarche;

    public VoitureElectrique(String modele) {
        this.modele = modele;
        this.vitesse = 0;
        this.batterie = 100;
        this.enMarche = false;
    }


    @Override
    public void demarrer() {
        if (batterie > 0) {
            enMarche = true;
            System.out.println(modele + " démarre silencieusement.");
        } else {
            System.out.println("Batterie vide !");
        }
    }

    @Override
    public void arreter() {
        enMarche = false;
        vitesse = 0;
        System.out.println(modele + " s'arrête.");
    }

    @Override
    public void accelerer(int nouvelleVitesse) {
        if (enMarche && nouvelleVitesse <= VITESSE_MAX_AUTOROUTE) {
            this.vitesse = nouvelleVitesse;
            this.batterie -= nouvelleVitesse / 10;
            System.out.println(modele + " accélère à " + vitesse + " km/h");
        } else if (!enMarche) {
            System.out.println("Impossible d'accélérer, le véhicule est à l'arrêt.");
        } else {
            System.out.println("Vitesse trop élevée ! Limite : " + VITESSE_MAX_AUTOROUTE + " km/h");
        }
    }


    @Override
    public void recharger() {
        batterie = 100;
        System.out.println(modele + " est rechargée à 100%.");
    }

    @Override
    public int getNiveauBatterie() {
        return batterie;
    }
}


