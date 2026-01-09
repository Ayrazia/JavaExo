package ExoExemple;

public class Cercle extends Forme {
    private double rayon;
    public Cercle(double rayon) {
        super("Cercle");
        this.rayon = rayon;
    }
    @Override
    public double calculerSurface() {
        return Math.PI * rayon * rayon;
    }
}
