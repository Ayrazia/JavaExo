package ExoExemple;

public class Main {


    public static void main(String[] args) {
        Employe emp1 = new Employe("Alice", (short) 30, 50000.0);
        Employe emp2 = new Employe("Bob", (short) 45, 70000.0);
        Employe emp3 = new Employe("Charlie", (short) 25, 60000.0);
        emp1.AfficherDetails();
        emp2.AfficherDetails();

        Personne per1 = new Personne("Alice", 30);
        per1.AfficherDetails();
        Etudiant etu1 = new Etudiant("David", 20, "Informatique");
        etu1.AfficherDetails();
        etu1.afficherDetailsFiliere();

        Chien Bul = new Chien("Bul", 32, "Buldog");
        Bul.sePresenter();
        Aligator Ali = new Aligator(5, "Ali", "Vert");
        Ali.sePresenter();
        Animal c = new Animal("alala", 23);
        c.sePresenter();
        Animal s = new Chien("boubou", 45, "Baba");
        s.sePresenter();

        Rectangle R1 = new Rectangle(4, 5);

        Cercle C1 = new Cercle(3);
        C1.calculerSurface();

        System.out.println(C1.calculerSurface());

        }
    }
