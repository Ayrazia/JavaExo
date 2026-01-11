package TD4.EXO4;

public class TestParc {
    public static void main(String[] args) {
        Equipement[] parc = new Equipement[] {
            new Ordinateur("PC01", "Bureau A1", true, "Windows 10"),
            new Imprimante("IMP01", "Bureau A2", true, 15),
            new Serveur("SRV01", "Datacenter", true, 8),
            new Imprimante("IMP02", "Bureau B1", false, 75),
            new Ordinateur("PC02", "Bureau B2", true, "Linux")
        };

        int nbOrd = 0;
        int nbImp = 0;
        int nbSrv = 0;

        for (Equipement e : parc) {
            GestionParc.diagnostiquerEquipement(e);
            if (e instanceof Ordinateur) nbOrd++;
            else if (e instanceof Imprimante) nbImp++;
            else if (e instanceof Serveur) nbSrv++;
        }

        System.out.println("Nombre d'ordinateurs: " + nbOrd);
        System.out.println("Nombre d'imprimantes: " + nbImp);
        System.out.println("Nombre de serveurs: " + nbSrv);
        System.out.println("Total d'équipements: " + parc.length);
    }
}

