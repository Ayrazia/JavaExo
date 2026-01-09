package ExoInterf;

public interface Vehicule {
    int VITESSE_MAX_AUTOROUTE = 130;

    void demarrer();

    void arreter();
    void accelerer(int vitesse);
    default void klaxonner() {
        System.out.println("klaxonner");

    }
}
