package TD4.EXO1;

public class Batterie extends InstrumentMusique{
    int nombreFuts;
    public Batterie(Double prix, String type, String nom, int nombreFuts) {
        super(prix, type, nom);
        this.nombreFuts = nombreFuts;
    }
    @Override
    public void jouer() {
        System.out.println("TONG TING TONG TING");
    }

    @Override
    public void accorder() {
        System.out.println("J'ajuste les peaux pour que les notes sois bonne");
    }
}
