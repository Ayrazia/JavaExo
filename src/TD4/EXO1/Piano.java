package TD4.EXO1;

public class Piano extends InstrumentMusique{
    int nombreTouches;
    public Piano(Double prix, String type, String nom, int nombreTouches) {
        super(prix, type, nom);
        this.nombreTouches = nombreTouches;
    }

    @Override
    public void jouer() {
        System.out.println("PLINNN, PLINNN, PLINNN");
    }

    @Override
    public void accorder() {
        System.out.println("J'accorde mon piano par un professionnelle pour que les notes sois bonne");
    }
}
