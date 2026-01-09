package TD3;

public class Exo5 {
    public static void main() {

        ProduitElectronique produit1 = new ProduitElectronique();
        produit1.afficherDetail();
        System.out.println("-------------------------------------------");
        ProduitElectronique produit2 = new ProduitElectronique("REF001", "Produit 2", 10.0);
        produit2.afficherDetail();
        System.out.println("-------------------------------------------");
        ProduitElectronique produit3 = new ProduitElectronique("REF002", "Produit 3", 20.0, 5, 3);
        produit3.afficherDetail();
        System.out.println("-------------------------------------------");
        ProduitElectronique produit4 = new ProduitElectronique(produit3);
        produit4.setStock(123);
        produit4.afficherDetail();
        System.out.println("-------------------------------------------");
        produit3.afficherDetail();

    }

    public static class ProduitElectronique {

        String reference;
        String nom;
        Double prix;
        int stock;
        int garantieAnnees;

        public ProduitElectronique() {
            this.reference = "REF000";
            this.nom = "Produit";
            this.prix = 0.0;
            this.stock = 0;
            this.garantieAnnees = 1;
        }

        public ProduitElectronique(String reference, String nom, Double prix, int stock, int garantieAnnees) {
            this.reference = reference;
            this.nom = nom;
            this.prix = prix;
            this.stock = stock;
            this.garantieAnnees = garantieAnnees;
        }

        public ProduitElectronique(String reference, String nom, Double prix) {
            this.reference = reference;
            this.nom = nom;
            this.prix = prix;
            this.stock = 10;
            this.garantieAnnees = 2;
        }

        public ProduitElectronique(ProduitElectronique produit) {
            this.reference = produit.reference;
            this.nom = produit.nom;
            this.prix = produit.prix;
            this.stock = produit.stock;
            this.garantieAnnees = produit.garantieAnnees;
        }

        public void afficherDetail() {
            System.out.println("Référence: " + this.reference);
            System.out.println("Nom: " + this.nom);
            System.out.println("Prix: " + this.prix + " EUR");
            System.out.println("Stock: " + this.stock + " unités");
            System.out.println("Garantie: " + this.garantieAnnees + " ans");
        }

        public void setStock(int stock) {
            this.stock = stock;
        }
    }
}
