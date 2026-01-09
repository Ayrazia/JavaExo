package ExoExemple;

public class Animal {
    protected String nom;
    protected int age;

    public Animal(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }

    public void manger() {
        System.out.println(nom + " mange.");
    }
    public void dormir() {
        System.out.println(nom + " dort.");
    }
    public void sePresenter() {
        System.out.println("Je suis " + nom + ", j'ai " + age + " ans.");
    }
}

