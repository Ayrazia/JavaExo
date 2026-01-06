package TD2;

import java.util.ArrayList;
import java.util.Collections;

public class Ex20 {
    public static void main() {
        System.out.println("-- TD2 Exercice 20 - Analyse de ventes sur 14 jours --");
        ArrayList<Double> ventes = new ArrayList<>(java.util.Arrays.asList(
                150.0, 200.0, 120.0, 300.0, 180.0, 220.0, 250.0,
                190.0, 280.0, 210.0, 160.0, 290.0, 230.0, 270.0
        ));
        double total = 0; double max = ventes.get(0); double min = ventes.get(0); int dayMax = 0, dayMin = 0;
        for (int i = 0; i < ventes.size(); i++) {
            double v = ventes.get(i);
            total += v;
            if (v > max) { max = v; dayMax = i; }
            if (v < min) { min = v; dayMin = i; }
        }
        double moyenne = total / ventes.size();
        int above = 0; int objectifAtteint = 0; for (double v : ventes) { if (v > moyenne) above++; if (v >= 250.0) objectifAtteint++; }
        ArrayList<Double> copy = new ArrayList<>(ventes); Collections.sort(copy, Collections.reverseOrder());
        System.out.println("Vente totale : " + total + "€");
        System.out.println("Vente moyenne : " + moyenne + "€");
        System.out.println("Meilleure vente : " + max + " (jour " + (dayMax+1) + ")");
        System.out.println("Pire vente : " + min + " (jour " + (dayMin+1) + ")");
        System.out.println("Jours > moyenne : " + above + " (" + ((above*100.0)/ventes.size()) + "%)");
        System.out.println("Objectif atteint : " + objectifAtteint + " jours (" + ((objectifAtteint*100.0)/ventes.size()) + "%)");
        System.out.println("Top 3 des ventes : " + copy.subList(0, Math.min(3, copy.size())));
        int t1=0,t2=0,t3=0,t4=0; for (double v : ventes) {
            if (v <= 150) t1++;
            else if (v <= 200) t2++;
            else if (v <= 250) t3++;
            else t4++;
        }
        System.out.println("Répartition :");
        System.out.println("0-150€ : " + t1 + " jours");
        System.out.println("151-200€ : " + t2 + " jours");
        System.out.println("201-250€ : " + t3 + " jours");
        System.out.println(">250€ : " + t4 + " jours\n");
    }
}

