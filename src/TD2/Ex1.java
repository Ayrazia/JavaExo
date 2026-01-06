package TD2;

public class Ex1 {
    public static void main() {
        System.out.println("-- TD2 Exercice 1 - Validation d'inscription --");

        int niveauEtudes = 1;
        if (niveauEtudes >= 2) {
            System.out.println("niveau=" + niveauEtudes + " -> Inscription validée – Niveau suffisant");
        } else {
            System.out.println("niveau=" + niveauEtudes + " -> Inscription refusée – Niveau insuffisant");
        }

        niveauEtudes = 4;
        if (niveauEtudes >= 2) {
            System.out.println("niveau=" + niveauEtudes + " -> Inscription validée – Niveau suffisant");
        } else {
            System.out.println("niveau=" + niveauEtudes + " -> Inscription refusée – Niveau insuffisant");
        }

        System.out.println();
    }
}
