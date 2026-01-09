package TD4.EXO4;

public class Serveur extends Equipement{
    int nombreCPU;
    public Serveur(String reference, String emplacement, boolean enService, int nombreCPU) {
        super(reference, emplacement, enService);
        this.nombreCPU = nombreCPU;
    }
    @Override
    public void effectuerMaintenance() {
        System.out.println("Maintenance et mise a jour du serveur");
    }

    public void sauvegarder() {
        System.out.println("Le serveur est en train de sauvegarder");
    }
}
