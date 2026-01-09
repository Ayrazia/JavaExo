package ExoExemple;

public class Chien extends Animal {
    private final String race;
    public Chien(String nom, int age, String race) {
        super(nom, age);
        this.race = race;
    }
    public void aboyer() {
        System.out.println(nom + " aboie");
    }
    @Override
    public void sePresenter() {
        System.out.println("Je suis un chien de race " + race);
    }
}
