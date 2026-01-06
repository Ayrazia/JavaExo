package TD2;

public class Ex9 {
    public static void main() {
        System.out.println("-- TD2 Exercice 9 - Gestion de notes --");
        double[] notes = {12.5, 8.0, 15.5, 10.0, 14.0, 6.5, 18.0, 11.5};
        double total = 0.0;
        double best = notes[0];
        double worst = notes[0];
        int admitted = 0;
        for (double n : notes) {
            total += n;
            if (n > best) best = n;
            if (n < worst) worst = n;
            if (n >= 10.0) admitted++;
        }
        double moyenne = total / notes.length;
        int nonAdmitted = notes.length - admitted;
        double taux = (admitted * 100.0) / notes.length;
        System.out.println("Moyenne de la classe : " + moyenne);
        System.out.println("Nombre d'admis : " + admitted);
        System.out.println("Nombre de non-admis : " + nonAdmitted);
        System.out.println("Meilleure note : " + best);
        System.out.println("Plus mauvaise note : " + worst);
        System.out.println("Taux de réussite : " + taux + "%\n");
    }
}

