package TD4.EXO1;

public class TestInstruments {
    public static void main() {
        InstrumentMusique[] instruments = new InstrumentMusique[3];
        instruments[0] = new Guitare(10.0, "Corde", "Gibson", 6);
        instruments[1] = new Piano(15.0, "Vent", "Yamaha", 8);
        instruments[2] = new Batterie(20.0, "Percussion", "Fender", 12);

        for (InstrumentMusique i : instruments) {
            i.afficheInfo();
            System.out.println("Prix avec TVA : " + i.calculerPrixAvecTVA());
            i.accorder();
            i.jouer();
            System.out.println("-------------------------------------------");
        }

    }
}
