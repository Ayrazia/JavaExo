package ExoExemple;

import java.util.Scanner;

public class Employe {
    static int id = 0;
    String nom;
    Short age;
    Double salaire;

    public Employe(String nom, Short age, Double salaire) {
        this.nom = nom;
        this.age = age;
        this.salaire = salaire;
        id++;
    }

    private String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    private Short getAge() {
        return age;
    }

    public void setAge(Short age) {
        this.age = age;
    }

    private Double getSalaire() {
        return salaire;
    }

    public void setSalaire(Double salaire) {
        this.salaire = salaire;
    }

    public void AfficherDetails() {
        System.out.println("Nom : " + getNom() + ", Age : " + getAge() + ", Salaire : " + getSalaire());
    }

    public void ModifierEmploye() {
        System.out.println("Souhaitez-vous modifier les informations de l'employe ? 'o' ou 'n'");
        Scanner sc = new Scanner(System.in);
        if (sc.nextLine().equals("o")) {
            AfficherDetails();
            System.out.println("Entrez le nouveau nom : ");
            setNom(sc.nextLine());
            if (sc.nextLine() != "") {
                setNom(sc.nextLine());
            } else {

            }

        } else if (sc.nextLine().equals("n")) {
            return;
        } else {
            System.out.println("Choix invalide.");
            return;
        }

    }
}
