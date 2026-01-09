package ExoInterf;

public class Main {
    public static void main(String[] args) {
        VoitureElectrique tesla = new VoitureElectrique("Tesla Model 3");

        tesla.demarrer();

        tesla.accelerer(80);
        tesla.klaxonner();

        System.out.println("Batterie restante : " + tesla.getNiveauBatterie() + "%");

        tesla.arreter();
        tesla.recharger();
    }

}
