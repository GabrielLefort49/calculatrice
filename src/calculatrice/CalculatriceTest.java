package calculatrice;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculatriceTest {
	@Test
    public void testAddition() {
        Calculatrice calculatrice = new Calculatrice();
		
        
        int addition1 = calculatrice.addition(4, 6);
        int addition2 = calculatrice.addition(10, 5);
        int addition3 = calculatrice.addition(-3, 3);

        assertEquals(10, addition1);
        assertEquals(15, addition2);
        assertEquals(0, addition3);
    }
	
	@Test
    public void testSoustraction() {
        Calculatrice calculatrice = new Calculatrice();
		
        
        int soustraction1 = calculatrice.soustraction(16, 6);
        int soustraction2 = calculatrice.soustraction(20, 5);
        int soustraction3 = calculatrice.soustraction(4, 4);

        assertEquals(10, soustraction1);
        assertEquals(15, soustraction2);
        assertEquals(0, soustraction3);
    }
	
	@Test
    public void testMultiplication() {
        Calculatrice calculatrice = new Calculatrice();
		
        
        int multiplication1 = calculatrice.multiplier(2, 5);
        int multiplication2 = calculatrice.multiplier(3, 5);
        int multiplication3 = calculatrice.multiplier(0, 3);

        assertEquals(10, multiplication1);
        assertEquals(15, multiplication2);
        assertEquals(0, multiplication3);
    }
	
	@Test
    public void testDivision() {
        Calculatrice calculatrice = new Calculatrice();
		
        
        double division1 = calculatrice.diviser(100, 10);
        double division2 = calculatrice.diviser(16, 4);
        double division3 = calculatrice.diviser(3, 3);

        assertEquals(10.0, division1);
        assertEquals(4.0, division2);
        assertEquals(1.0, division3);
    }
	
	
}
