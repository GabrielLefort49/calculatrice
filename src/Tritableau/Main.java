package Tritableau;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tableau tableau = new Tableau();
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("On va faire un tri de tableau croissant\n");
		System.out.print("Combien de nombres voulez-vous entrer ? ");
        int taille = scanner.nextInt();

        int[] tab = new int[taille];

        System.out.println("Entrez les nombres :");
        for (int i = 0; i < taille; i++) {
            tab[i] = scanner.nextInt();
        }

        
        System.out.println("Contenu du tableau :");
        for (int val : tableau.trierListe(tab)) {
            System.out.print(val + " ");
        }

        scanner.close();
	}

}
