package Tritableau;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;


public class TabelauTest {
	
	@Test
	public void testTrierList() {
	    Tableau tableau = new Tableau();
		
	    
	    int[] tableau1 = tableau.trierListe(new int[]{6, -4, 0, 54}); 
	    
	
	    assertArrayEquals(new int[]{-4,0,6,54}, tableau1);
	   
	}
}