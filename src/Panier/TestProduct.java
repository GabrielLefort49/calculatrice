package Panier;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestProduct {

    private ShoppingCart cart;

    @BeforeEach
    public void setUp() {
        cart = new ShoppingCart();
    }

    @Test
    public void testPanierInitialementVide() {
        assertEquals(0, cart.getItemCount());
        assertEquals(0.0, cart.getTotalPrice(), 0.001);
    }

    @Test
    public void testAjoutProduit() {
        Product p1 = new Product("Livre", 12.99);
        cart.addProduct(p1);
        assertEquals(1, cart.getItemCount());
        assertEquals(12.99, cart.getTotalPrice(), 0.001);
    }

    @Test
    public void testAjoutPlusieursProduits() {
        cart.addProduct(new Product("Stylo", 1.5));
        cart.addProduct(new Product("Cahier", 3.0));
        assertEquals(2, cart.getItemCount());
        assertEquals(4.5, cart.getTotalPrice(), 0.001);
    }

    @Test
    public void testAjoutProduitNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            cart.addProduct(null);
        });
    }

    @Test
    public void testProduitPrixNegatif() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Product("Clé USB", -5.0);
        });
    }

    @Test
    public void testViderPanier() {
        cart.addProduct(new Product("Agenda", 10.0));
        cart.addProduct(new Product("Lampe", 20.0));
        cart.clearCart();
        assertEquals(0, cart.getItemCount());
        assertEquals(0.0, cart.getTotalPrice(), 0.001);
    }
}