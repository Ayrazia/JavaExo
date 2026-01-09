package TD3;

import java.util.Arrays;

public class Exo3 {
    public static void main() {

                TableRestaurant[] tables = new TableRestaurant[5];
        tables[0] = new TableRestaurant(1, 2, false, "");
        tables[1] = new TableRestaurant(2, 4, true, "Dupont");
        tables[2] = new TableRestaurant(3, 6, false, "");
        tables[3] = new TableRestaurant(4, 2, true, "Martin");
        tables[4] = new TableRestaurant(5, 8, false, "");

        System.out.println("Les tables disponibles, et le nombre de places sont :");
        for (TableRestaurant table : tables) {
            if (!table.estReservee) System.out.println("Table numéro " + table.numeroTable + " avec " + table.nombrePlaces + " places");
        }
        System.out.println("Total places disponible : " + Arrays.stream(tables).filter(table -> !table.estReservee).mapToInt(table -> table.nombrePlaces).sum());

    }
    public static class TableRestaurant {
        int numeroTable;
        int nombrePlaces;
        boolean estReservee;
        String nomClient;

        public TableRestaurant(int numeroTable, int nombrePlaces, boolean estReservee, String nomClient) {
            this.numeroTable = numeroTable;
            this.nombrePlaces = nombrePlaces;
            this.estReservee = estReservee;
            this.nomClient = nomClient;
        }
    }


}
