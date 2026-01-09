package TD3;

public class Exo2 {
    public static void main() {

        String moinsDe50000KM = "";
        Double prixTotal = 0.0;
        Voiture voiture1 = new Voiture("Renault", "Clio", 45000, 35.50);
        Voiture voiture2 = new Voiture("Peugeot", "3008", 12000, 55);
        Voiture voiture3 = new Voiture("Citroën", "C3", 78000, 30);
        Voiture voiture4 = new Voiture("Toyota", "Yaris", 5000, 40);
        for (Voiture v : new Voiture[]{voiture1, voiture2, voiture3, voiture4})
            prixTotal += v.prixLocationJour * 7;
        for (Voiture v : new Voiture[]{voiture1, voiture2, voiture3, voiture4})
            if (v.estAvecCompteur()) moinsDe50000KM += v.marque + " " + v.modele + ", ";
        System.out.println("Voici les voitures avec moins de 50000KM au compteur " + moinsDe50000KM);

        System.out.println("Prix total pour la location de tout les véhicules pendant 7 jours : " + prixTotal);

    }

    public static class Voiture {
        String marque;
        String modele;
        int kilometrage;
        double prixLocationJour;


        public Voiture(String marque, String modele, int kilometrage, double prixLocationJour) {
            this.marque = marque;
            this.modele = modele;
            this.kilometrage = kilometrage;
            this.prixLocationJour = prixLocationJour;
        }

        public boolean estAvecCompteur() {
            return this.kilometrage < 50000;
        }
    }
}
