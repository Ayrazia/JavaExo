package TD1;

public class Ex10 {
    public static void run() {
        System.out.println("-- Exercice 10 --");
        int x = 5;
        int y = 10;
        System.out.println("Avant échange : x = " + x + ", y = " + y);
        int tmp = x; x = y; y = tmp;
        System.out.println("Après échange : x = " + x + ", y = " + y + "\n");
    }
}

