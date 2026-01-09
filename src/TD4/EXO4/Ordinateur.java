package TD4.EXO4;

import TD4.EXO2.AppareilElectronique;

public class Ordinateur extends Equipement {
    String systemExploitation;

    public Ordinateur(String reference, String emplacement, boolean enService, String systemExploitation) {
        super(reference, emplacement, enService);
        this.systemExploitation = systemExploitation;
    }

    @Override
    public void effectuerMaintenance() {
        System.out.println("L'ordinateur est en cours de maintenance('Mise a jour ou problème de Windaube')");
    }

    public void redemarrer() {
        System.out.println("L'ordinateur est en train de se redemarrer");
    }



}
