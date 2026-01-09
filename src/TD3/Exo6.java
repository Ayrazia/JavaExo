package TD3;


public class Exo6 {
    public static void main() {

        ReservationHotel reserv1 = new ReservationHotel("RES2025001", "Marie Dubois", 3, 120.00);
        System.out.println(reserv1.calculerCoutTotal());
        reserv1.setNombreNuits(35);
        System.out.println(reserv1.nombreNuits);
        reserv1.setNombreNuits(5);
        System.out.println(reserv1.nombreNuits);
        System.out.println(reserv1.calculerCoutTotal());

    }

    public static class ReservationHotel {
        String numeroReservation;
        String nomClient;
        int nombreNuits;
        double prixParNuit;

        public ReservationHotel(String numéroReservation, String nomClient, int nombreNuits, double prixParNuit) {
            this.numeroReservation = numéroReservation;
            this.nomClient = nomClient;
            this.nombreNuits = nombreNuits;
            this.prixParNuit = prixParNuit;
        }

        public String getNumeroReservation() {
            return numeroReservation;
        }

        public String getNomClient() {
            return nomClient;
        }

        public int getNombreNuits() {
            return nombreNuits;
        }

        public double getPrixParNuit() {
            return prixParNuit;
        }

        public void setNombreNuits(int nombreNuits) {
            if (nombreNuits >= 1 && nombreNuits <= 30) {
                this.nombreNuits = nombreNuits;
            } else {
                System.out.println("Nombre de nuits invalide");
            }
        }

        public void setPrixParNuit(double prixParNuit) {
            if (prixParNuit >= 50.0 && prixParNuit <= 1000.0) {
                this.prixParNuit = prixParNuit;
            }

        }
        public double calculerCoutTotal() {
            return nombreNuits * prixParNuit;
        }
    }
}
