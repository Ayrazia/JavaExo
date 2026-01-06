package TD1;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Réponses théoriques ===\n");

        System.out.println("1) Qui est le créateur du langage Java ?");
        System.out.println("   Le créateur principal est James Gosling (Sun Microsystems)\n");

        System.out.println("2) Que signifie \"Write Once, Run Anywhere\" ?");
        System.out.println("   Un programme Java compilé peut s'exécuter sur n'importe quelle plate-forme disposant d'une JVM\n");

        System.out.println("3) Quel est le rôle de la JVM ?");
        System.out.println("   Gère la mémoire et fournit l'abstraction entre le bytecode et le système hôte\n");

        System.out.println("4) Différence compilation / interprétation ?");
        System.out.println("   La compilation transforme le code source en bytecode (.class). L'interprétation exécute des instructions à la volée. Java compile en bytecode, puis la JVM interprète\n");

        System.out.println("5) Schéma : Code Java → ? → JVM → ?");
        System.out.println("   Réponse : Code Java -> compilation -> bytecode (.class) -> JVM -> exécution sur la plate-forme\n");

        System.out.println("6) Pourquoi Java est portable ?");
        System.out.println("   Parce que le bytecode n'est pas lié à une architecture matérielle : toute plate-forme avec une JVM peut l'exécuter.\n");

        System.out.println("7) Rôle de public / static / void / String[] args ?");
        System.out.println("   public : accès externe nécessaire pour que la JVM puisse appeler main");
        System.out.println("   static : la méthode appartient à la classe, pas à une instance");
        System.out.println("   void : la méthode ne renvoie rien");
        System.out.println("   String[] args : tableau contenant les arguments de la ligne de commande\n");

        System.out.println("8) Que produit \"javac Bonjour.java\" ?");
        System.out.println("   Le compilateur javac compile Bonjour.java et produit Bonjour.class si la compilation réussit.\n");

        System.out.println("=== Fin des réponses ===");
    }
}