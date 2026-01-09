package ExoExemple;

public class Etudiant extends Personne {
    private String filiere;

    public Etudiant(String nom, int age, String filiere) {
        super(nom, age);
        this.filiere = filiere;
    }

    public void afficherDetailsFiliere() {
        System.out.println("Filiere : " + filiere);
    }
}
