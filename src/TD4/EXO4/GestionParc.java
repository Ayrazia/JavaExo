package TD4.EXO4;

public class GestionParc {
    public static void diagnostiquerEquipement(Equipement eq) {

        eq.afficherEtat();
        eq.effectuerMaintenance();

        if (eq instanceof Ordinateur) {
            Ordinateur o = (Ordinateur) eq;
            System.out.println("OS: " + o.systemExploitation);
            o.redemarrer();
        } else if (eq instanceof Imprimante) {
            Imprimante i = (Imprimante) eq;
            System.out.println("Niveau encre: " + i.niveauEncre + "%");
            if (i.niveauEncre < 20) {
                i.remplacerEncre();
            }
        } else if (eq instanceof Serveur) {
            Serveur s = (Serveur) eq;
            System.out.println("Nombre CPU: " + s.nombreCPU);
            s.sauvegarder();
        }

        System.out.println();

    }
}
