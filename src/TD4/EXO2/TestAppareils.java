package TD4.EXO2;

public class TestAppareils {
    public static void main(String[] args) {

        Smartphone iPom4s = new Smartphone("iPom", "4s", 750, (byte) 50, 150.0, true, "WifiMaison");
        OrdinateurPortable AzuzBookPro = new OrdinateurPortable("Azuz", "BookPro", 1800, (byte) 90, 800.0, true, "PartageConnexioniPom4s");
        Tablette SamSungTab = new Tablette("SamSung", "Tab", 600.0, (byte) 30, 400.0);

        iPom4s.allumer();
        iPom4s.connecterWifi("MonWifi");
        iPom4s.afficherBatterie();
        iPom4s.afficherPortabilite();
        iPom4s.estConnecte();
        iPom4s.recharger();
        iPom4s.afficherBatterie();
        iPom4s.deconnecter();
        System.out.println("-------------------------------------------");
        AzuzBookPro.allumer();
        AzuzBookPro.connecterWifi("MonWifi");
        AzuzBookPro.afficherBatterie();
        AzuzBookPro.afficherPortabilite();
        AzuzBookPro.estConnecte();
        AzuzBookPro.recharger();
        AzuzBookPro.afficherBatterie();
        AzuzBookPro.deconnecter();
        System.out.println("-------------------------------------------");
        SamSungTab.allumer();
        SamSungTab.afficherBatterie();
        SamSungTab.afficherPortabilite();
        SamSungTab.recharger();
        SamSungTab.afficherBatterie();


    }
    }
