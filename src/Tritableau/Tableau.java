package Tritableau;

public class Tableau {
	public int[] trierListe(int[] tab) {
	    int[] newTab = tab.clone(); 
	    java.util.Arrays.sort(newTab); 
	    return newTab; 
	}
}
