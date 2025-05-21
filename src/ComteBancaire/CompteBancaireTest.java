package ComteBancaire;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CompteBancaireTest {

    private CompteBancaire compte;

    @BeforeEach
    public void setUp() {
        compte = new CompteBancaire("Lefort Gabriel", 100.0);
    }

    @Test
    public void testCreationCompteAvecSoldeValide() {
        CompteBancaire compteValide = new CompteBancaire("Alice", 200.0);
        assertEquals(200.0, compteValide.getBalance());
        assertEquals("Alice", compteValide.getOwner());
    }

    @Test
    public void testRefusCreationSoldeNegatif() {
        assertThrows(IllegalArgumentException.class, () -> {
            new CompteBancaire("Bob", -50.0);
        });
    }

    @Test
    public void testDepotArgentValide() {
        compte.deposit(50.0);
        assertEquals(150.0, compte.getBalance(), 0.001);
    }

    @Test
    public void testRefusDepotMontantNegatif() {
        assertThrows(IllegalArgumentException.class, () -> {
            compte.deposit(-10.0);
        });
    }

    @Test
    public void testRefusDepotMontantNul() {
        assertThrows(IllegalArgumentException.class, () -> {
            compte.deposit(0.0);
        });
    }

    @Test
    public void testRetraitValide() {
        compte.withdraw(40.0);
        assertEquals(60.0, compte.getBalance(), 0.001);
    }

    @Test
    public void testRefusRetraitSuperieurAuSolde() {
        assertThrows(IllegalArgumentException.class, () -> {
            compte.withdraw(200.0);
        });
    }

    @Test
    public void testRefusRetraitMontantNegatif() {
        assertThrows(IllegalArgumentException.class, () -> {
            compte.withdraw(-20.0);
        });
    }

    @Test
    public void testRefusRetraitMontantNul() {
        assertThrows(IllegalArgumentException.class, () -> {
            compte.withdraw(0.0);
        });
    }
}

