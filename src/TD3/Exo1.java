package TD3;

public class Exo1 {

    public static void main(String[] args) {
     Livre livre1 = new Livre("Le Petit Prince", "Antoine de Saint-Exupéry", 1943, true);
     Livre livre2 = new Livre("1984", "George Orwell", 1949, false);
     Livre livre3 = new Livre("L'Étranger", "Albert Camus", 1942, true);

     System.out.println(livre1.titre + " par " + livre1.auteur + "(" + livre1.anneePublication + ")" + " - Disponible : " + livre1.disponible);
    }


    public static class Livre {
        String titre;
        String auteur;
        int anneePublication;
        Boolean disponible;

        public Livre(String titre, String auteur, int anneePublication, Boolean disponible) {
            this.titre = titre;
            this.auteur = auteur;
            this.anneePublication = anneePublication;
            this.disponible = disponible;
        }
    }
}
