package TD2;

public class Ex7 {
    public static void main() {
        System.out.println("-- TD2 Exercice 7 - Analyse des ventes mensuelles --");
        double[] chiffreAffaires = {12500.0, 9800.0, 15200.0, 11000.0, 18500.0, 13700.0};
        double total = 0.0;
        for (double ca : chiffreAffaires) total += ca;
        double moyenne = total / chiffreAffaires.length;
        int countAbove = 0;
        for (double ca : chiffreAffaires) if (ca > moyenne) countAbove++;
        System.out.println("Chiffre d'affaires total : " + total + " €");
        System.out.println("Chiffre d'affaires moyen : " + moyenne + " €");
        System.out.println("Nombre de mois au-dessus de la moyenne : " + countAbove);
        System.out.println();
    }
}

