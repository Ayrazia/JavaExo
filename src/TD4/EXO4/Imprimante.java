package TD4.EXO4;

public class Imprimante extends Equipement{
    int niveauEncre;

    public Imprimante(String reference, String emplacement, boolean enService, int niveauEncre) {
        super(reference, emplacement, enService);
        this.niveauEncre = niveauEncre;
    }

    @Override
    public void effectuerMaintenance() {
        System.out.println("Maintenance ou réparation de l'imprimante");
    }

    public void remplacerEncre() {
        System.out.println("L'imprimante est en train de remplacer l'encre");
        niveauEncre = 100;
    }
}
