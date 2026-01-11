package TD3;

class Vehicule {
    protected String immatriculation;
    protected String marque;
    protected int annee;

    public Vehicule(String immatriculation, String marque, int annee) {
        this.immatriculation = immatriculation;
        this.marque = marque;
        this.annee = annee;
    }

    public void afficherInfos() {
        System.out.println("Immatriculation: " + immatriculation);
        System.out.println("Marque: " + marque);
        System.out.println("Année: " + annee);
    }
}

class Camion extends Vehicule {
    private int chargeMaximale;

    public Camion(String immatriculation, String marque, int annee, int chargeMaximale) {
        super(immatriculation, marque, annee);
        this.chargeMaximale = chargeMaximale;
    }

    public void afficherInfosCamion() {
        afficherInfos();
        System.out.println("Charge maximale: " + chargeMaximale + " kg");
        System.out.println();
    }
}

class Moto extends Vehicule {
    private int cylindree;

    public Moto(String immatriculation, String marque, int annee, int cylindree) {
        super(immatriculation, marque, annee);
        this.cylindree = cylindree;
    }

    public void afficherInfosMoto() {
        afficherInfos();
        System.out.println("Cylindrée: " + cylindree + " cm³");
        System.out.println();
    }
}

public class Exo8 {
    public static void main(String[] args) {
        Camion c1 = new Camion("AB-123-CD", "Volvo", 2015, 12000);
        Camion c2 = new Camion("EF-456-GH", "Mercedes", 2018, 15000);

        Moto m1 = new Moto("12-ABC-34", "Yamaha", 2020, 600);
        Moto m2 = new Moto("56-DEF-78", "Honda", 2019, 1000);

        c1.afficherInfosCamion();
        c2.afficherInfosCamion();
        m1.afficherInfosMoto();
        m2.afficherInfosMoto();
    }
}
