package TD3;

public class Exo4 {
    public static void main() {
        CompteBancaire compte1 = new CompteBancaire();
        CompteBancaire compte2 = new CompteBancaire("FR123456", "Sophie Leblanc", 2500.00, "Épargne");
        CompteBancaire compte3 = new CompteBancaire(compte2);
        compte3.setNomTitulaire("Jean-Paul");
        System.out.println(compte1.numeroCompte + ", " + compte1.nomTitulaire + ", " + compte1.solde + ", " + compte1.typeCompte);
        System.out.println(compte2.numeroCompte + ", " + compte2.nomTitulaire + ", " + compte2.solde + ", " + compte2.typeCompte);
        System.out.println(compte3.numeroCompte + ", " + compte3.nomTitulaire + ", " + compte3.solde + ", " + compte3.typeCompte);

    }

    public static class CompteBancaire {
        String numeroCompte;
        String nomTitulaire;
        Double solde;
        String typeCompte;

        public CompteBancaire() {
            this.numeroCompte = "000000";
            this.nomTitulaire = "Anonyme";
            this.solde = 0.0;
            this.typeCompte = "Courant";
        }

        public CompteBancaire(String numeroCompte, String nomTitulaire, Double solde, String typeCompte) {
            this.numeroCompte = numeroCompte;
            this.nomTitulaire = nomTitulaire;
            this.solde = solde;
            this.typeCompte = typeCompte;
        }

        public CompteBancaire(CompteBancaire compte) {
            this.numeroCompte = compte.numeroCompte;
            this.nomTitulaire = compte.nomTitulaire;
            this.solde = compte.solde;
            this.typeCompte = compte.typeCompte;
        }

        public void setNomTitulaire(String nomTitulaire) {
            this.nomTitulaire = nomTitulaire;
        }
    }

}
