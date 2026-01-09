package ExoExemple;


    public class Forme {
        protected String nom;
        public Forme(String nom) {
            this.nom = nom;
        }
        public double calculerSurface() {
            return 0;
        }

        public void dessiner() {
            System.out.println("Dessin d'une forme générique");
        }
        public void dessiner(String couleur) {
            System.out.println("Dessin d'une forme en " + couleur);
        }
        public void dessiner(String couleur, int epaisseur) {
            System.out.println("Dessin d'une forme en " + couleur + ", épaisseur: " + epaisseur); }
        }

