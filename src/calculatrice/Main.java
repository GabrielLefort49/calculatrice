package calculatrice;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Calculatrice calculatrice = new Calculatrice();
        Scanner scanner = new Scanner(System.in);
        String continuer;

        System.out.println("Bienvenue dans la calculatrice de Gabriel !");
        System.out.println("Opérations disponibles : + - * /");

        do {
            System.out.print("\nEntrez la première valeur : ");
            int a = scanner.nextInt();

            System.out.print("Entrez l'opération (+, -, *, /) : ");
            String operateur = scanner.next();

            System.out.print("Entrez la deuxième valeur : ");
            int b = scanner.nextInt();

            switch (operateur) {
                case "+":
                    System.out.println("Résultat : " + calculatrice.addition(a, b));
                    break;
                case "-":
                    System.out.println("Résultat : " + calculatrice.soustraction(a, b));
                    break;
                case "*":
                    System.out.println("Résultat : " + calculatrice.multiplier(a, b));
                    break;
                case "/":
                    if (b != 0) {
                        System.out.println("Résultat : " + calculatrice.diviser(a, b));
                    } else {
                        System.out.println("Erreur : division par zéro !");
                    }
                    break;
                default:
                    System.out.println("Erreur : opérateur invalide !");
            }

            System.out.print("\nVoulez-vous effectuer un autre calcul ? (oui/non) : ");
            continuer = scanner.next().toLowerCase();

        } while (continuer.equals("oui"));

        System.out.println("Merci d’avoir utilisé la calculatrice !");
        scanner.close();
    }
}
