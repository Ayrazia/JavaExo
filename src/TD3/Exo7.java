package TD3;

class Abonnement {
    private String idAbonnement;
    private String email;
    private String formule;
    private double prixMensuel;
    private boolean actif;

    public Abonnement(String idAbonnement, String email, String formule, double prixMensuel, boolean actif) {
        this.idAbonnement = idAbonnement;
        this.email = email;
        this.formule = formule;
        this.prixMensuel = prixMensuel;
        this.actif = actif;
    }

    public String getIdAbonnement() {
        return idAbonnement;
    }
    public String getEmail() {
        return email;
    }
    public String getFormule() {
        return formule;
    }
    public double getPrixMensuel() {
        return prixMensuel;
    }
    public boolean isActif() {
        return actif;
    }

    public void setEmail(String email) {
        if (email != null && email.contains("@") && email.contains(".")) {
            this.email = email;
        } else {
            System.out.println("Email invalide, changement annulé");
        }
    }

    public void setFormule(String formule) {
        if ("Basic".equals(formule)) {
            this.formule = "Basic";
            this.prixMensuel = 9.99;
        } else if ("Standard".equals(formule)) {
            this.formule = "Standard";
            this.prixMensuel = 14.99;
        } else if ("Premium".equals(formule)) {
            this.formule = "Premium";
            this.prixMensuel = 19.99;
        } else {
            System.out.println("Formule invalide, changement annulé");
        }
    }

    public void setActif(boolean actif) { this.actif = actif; }

    public void afficherDetails() {
        System.out.println("ID: " + idAbonnement);
        System.out.println("Email: " + email);
        System.out.println("Formule: " + formule);
        System.out.println("Prix mensuel: " + prixMensuel);
        System.out.println("Actif: " + (actif ? "Oui" : "Non"));
        System.out.println();
    }

    public double calculerCoutAnnuel() {
        return actif ? prixMensuel * 12 : 0.0;
    }
}

public class Exo7 {
    public static void main(String[] args) {
        Abonnement a1 = new Abonnement("A1", "user1@example.com", "Basic", 9.99, true);
        Abonnement a2 = new Abonnement("A2", "user2@example.com", "Standard", 14.99, true);
        Abonnement a3 = new Abonnement("A3", "user3@example.com", "Premium", 19.99, true);

        a1.afficherDetails();
        a2.afficherDetails();
        a3.afficherDetails();

        a2.setActif(false);

        a1.setFormule("VIP");

        a1.setFormule("Premium");

        double totalAnnuel = a1.calculerCoutAnnuel() + a2.calculerCoutAnnuel() + a3.calculerCoutAnnuel();

        System.out.println("Cout annuel total abonnements actifs: " + totalAnnuel);
    }
}
