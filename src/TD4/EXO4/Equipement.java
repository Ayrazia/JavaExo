package TD4.EXO4;

public abstract class Equipement {
    String reference;
    String emplacement;
    boolean enService;

    public Equipement(String reference, String emplacement, boolean enService) {
        this.reference = reference;
        this.emplacement = emplacement;
        this.enService = enService;
    }

    public abstract void effectuerMaintenance();

    public void afficherEtat() {

        System.out.println("Référence: " + reference);
        System.out.println("Emplacement: " + emplacement);
        System.out.println("En service: " + (enService ? "Oui" : "Non"));

    }
}
