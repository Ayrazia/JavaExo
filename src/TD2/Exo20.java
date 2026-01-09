package TD2;

import java.util.*;

public class Exo20 {
    public static void main(String[] args) {

        ArrayList<Double> ventesQuotidiennes = new ArrayList<>(Arrays.asList(
                150.0, 200.0, 120.0, 300.0, 180.0, 220.0, 250.0,
                190.0, 280.0, 210.0, 160.0, 290.0, 230.0, 270.0
        ));

        System.out.println("Vente totale : " + ventesQuotidiennes.stream().reduce(0.0, Double::sum));
        System.out.println("Vente moyenne : " + ventesQuotidiennes.stream().reduce(0.0, (a, b) -> a + b) / ventesQuotidiennes.size());
        System.out.println("Vente maximale et jour correspondant : " + ventesQuotidiennes.stream().max(Double::compare).get());
        System.out.println("Vente minimale et jour correspondant : " + ventesQuotidiennes.stream().min(Double::compare).get());
        System.out.println("Nombre de jour ou ventes > moyenne : " + ventesQuotidiennes.stream().filter(v -> v > ventesQuotidiennes.stream().reduce(0.0, Double::sum) / ventesQuotidiennes.size()).count());
        System.out.println("Pourcentage de jours ou ventes > moyenne : " + ventesQuotidiennes.stream().filter(v->v > ventesQuotidiennes.stream().reduce(0.0, Double::sum) / ventesQuotidiennes.size()).count() / ventesQuotidiennes.size() * 100 + "%");
        System.out.println("objectif = 250E / jour");
        System.out.println("Combien de jours ont atteint l'objectif : " + ventesQuotidiennes.stream().filter(v -> v >= 250.0).count());
        System.out.println("Taux d'atteinte de l'objectif : " + ventesQuotidiennes.stream().filter(v -> v >= 250.0).count() / ventesQuotidiennes.size() * 100 + "%");
        System.out.println("Top 3 des ventes : " + ventesQuotidiennes.stream().sorted(Comparator.reverseOrder()).limit(3).toList());
        System.out.println("Répartition des ventes : ");
        System.out.println("0 a 150 Euros : " + ventesQuotidiennes.stream().filter(v -> v <= 150.0).count());
        System.out.println("151 Euros a 200 Euros : " + ventesQuotidiennes.stream().filter(v -> v > 151.0 && v <= 200.0).count() + " Jours");
        System.out.println("201 Euros a 250 Euros : " + ventesQuotidiennes.stream().filter(v -> v > 201.0 && v <= 250.0).count() + " Jours");
        System.out.println("Plus de 251 Euros : " + ventesQuotidiennes.stream().filter(v -> v > 251.0).count() + " Jours");

    }

}
