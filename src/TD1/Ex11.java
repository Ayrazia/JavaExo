package TD1;

import java.time.Year;

public class Ex11 {
    public static void run() {
        System.out.println("-- Exercice 11 --");
        int anneeNaissance = 2001;
        int anneeCourante = Year.now().getValue();
        int age = anneeCourante - anneeNaissance;
        System.out.println("Année de naissance : " + anneeNaissance);
        System.out.println("Année courante : " + anneeCourante);
        System.out.println("Âge approximatif : " + age + "\n");
    }
}

