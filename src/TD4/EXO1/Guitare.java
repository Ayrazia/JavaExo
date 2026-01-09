package TD4.EXO1;

public class Guitare extends InstrumentMusique {

    int nombreCordes;

    public Guitare(Double prix, String type, String nom, int nombreCordes) {
        super(prix, type, nom);
        this.nombreCordes = nombreCordes;
    }

    @Override
    public void jouer() {
        System.out.println("TONNNNnnnn, TONNNNnnnn, TINNNNnnnn");
    }

    @Override
    public void accorder() {
        System.out.println("J'accorde ma guitare pour que les notes sois bonne");
    }
}
