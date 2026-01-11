package TD3;

public class Exo9 {
    public static void main(String[] args) {
        Commercial com1 = new Commercial("C001", "Dupont", "Alice", 2500.0, 20000.0, 0.05);
        Commercial com2 = new Commercial("C002", "Martin", "Paul", 2400.0, 15000.0, 0.06);

        Technicien t1 = new Technicien("T001", "Durand", "Luc", 2000.0, 10, 15.0);
        Technicien t2 = new Technicien("T002", "Bernard", "Eva", 2100.0, 5, 20.0);

        Manager m1 = new Manager("M001", "Legrand", "Sophie", 4000.0, 800.0);

        com1.afficherFicheCommercial();
        com2.afficherFicheCommercial();
        t1.afficherFicheTechnicien();
        t2.afficherFicheTechnicien();
        m1.afficherFicheManager();

        double masseSalariale = com1.calculerSalaire() + com2.calculerSalaire() + t1.calculerSalaire() + t2.calculerSalaire() + m1.calculerSalaire();

        System.out.println("Masse salariale totale: " + masseSalariale);
    }
}

class Personnel {
    protected String matricule;
    protected String nom;
    protected String prenom;
    protected double salaireBase;

    public Personnel(String matricule, String nom, String prenom, double salaireBase) {
        this.matricule = matricule;
        this.nom = nom;
        this.prenom = prenom;
        this.salaireBase = salaireBase;
    }

    public double calculerSalaire() {
        return salaireBase;
    }

    public void afficherFiche() {
        System.out.println("Matricule: " + matricule);
        System.out.println("Nom: " + nom);
        System.out.println("Prénom: " + prenom);
        System.out.println("Salaire: " + calculerSalaire());
    }
}

class Commercial extends Personnel {
    private double chiffreAffaires;
    private double tauxCommission;

    public Commercial(String matricule, String nom, String prenom, double salaireBase, double chiffreAffaires, double tauxCommission) {
        super(matricule, nom, prenom, salaireBase);
        this.chiffreAffaires = chiffreAffaires;
        this.tauxCommission = tauxCommission;
    }

    @Override
    public double calculerSalaire() {
        return salaireBase + (chiffreAffaires * tauxCommission);
    }

    public void afficherFicheCommercial() {
        afficherFiche();
        System.out.println("Chiffre d'affaires: " + chiffreAffaires);
        System.out.println("Taux commission: " + tauxCommission);
        System.out.println();
    }
}

class Technicien extends Personnel {
    private int nombreHeuresSupp;
    private double tauxHoraire;

    public Technicien(String matricule, String nom, String prenom, double salaireBase, int nombreHeuresSupp, double tauxHoraire) {
        super(matricule, nom, prenom, salaireBase);
        this.nombreHeuresSupp = nombreHeuresSupp;
        this.tauxHoraire = tauxHoraire;
    }

    @Override
    public double calculerSalaire() {
        return salaireBase + (nombreHeuresSupp * tauxHoraire);
    }

    public void afficherFicheTechnicien() {
        afficherFiche();
        System.out.println("Heures supp: " + nombreHeuresSupp);
        System.out.println("Taux horaire: " + tauxHoraire);
        System.out.println();
    }
}

class Manager extends Personnel {
    private double prime;

    public Manager(String matricule, String nom, String prenom, double salaireBase, double prime) {
        super(matricule, nom, prenom, salaireBase);
        this.prime = prime;
    }

    @Override
    public double calculerSalaire() {
        return salaireBase + prime;
    }

    public void afficherFicheManager() {
        afficherFiche();
        System.out.println("Prime: " + prime);
        System.out.println();
    }
}


