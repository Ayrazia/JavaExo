package ExoExemple;

    public class Rectangle extends Forme {
        private double longueur;
        private double largeur;
        public Rectangle(double longueur, double largeur) {
            super("Rectangle");
            this.longueur = longueur;
            this.largeur = largeur;
        }
        @Override
        public double calculerSurface() {
            return longueur * largeur;
        }
}
