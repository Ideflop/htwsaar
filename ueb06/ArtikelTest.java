import org.junit.Test;
import static org.junit.Assert.*;

public class ArtikelTest {

    /**
     * Test if the ArtikelNr is set correctly
     * Also test if the Constructor work correctly
     */
    @Test
    public void testConstructorOhneFehler() {
        // Test the main constructor
        Artikel a1 = new Artikel(1000, "Test Artikel 1", 10, 5);
        assertEquals(1000, a1.getArtikelNr());
        assertEquals("Test Artikel 1", a1.getArt());
        assertEquals(10, a1.getBestand());
        assertEquals(5, a1.getPreis(), 0.001);

        // Test the second constructor
        Artikel a2 = new Artikel(9999, "Test Artikel 2", 3.0);
        assertEquals(9999, a2.getArtikelNr());
        assertEquals("Test Artikel 2", a2.getArt());
        assertEquals(0, a2.getBestand());
        assertEquals(3.0, a2.getPreis(), 0.001);
        

    }

    /**
     * Test if the Constructor throw an Exception if the ArtikelNr is not valid
     */
    @Test
    public void testConstructorMitFehler() {

        assertThrows(IllegalArgumentException.class, () -> new Artikel(-1, "Test Artikel 3", 3.0));
        assertThrows(IllegalArgumentException.class, () -> new Artikel(1, "Test Artikel 3", 3.0));
        assertThrows(IllegalArgumentException.class, () -> new Artikel(10000, "Test Artikel 4", 3.0));
        assertThrows(IllegalArgumentException.class, () -> new Artikel(999, "Test Artikel 5", 3.0));
    }

    /**
     * Test bucheZugang works correctly
     */
    @Test
    public void testBucheZugangOhneFehler() {
        Artikel a1 = new Artikel(1000, "Test Artikel 1", 10, 5.0);
        assertEquals(10, a1.getBestand());

        a1.bucheZugang(5);
        assertEquals(15, a1.getBestand(), 0.001);

    }

    /**
     * Test bucheZugang throw an Exception if the value is not valid
     */
    @Test
    public void testBucheZugangMitFehler() {
        Artikel a1 = new Artikel(1000, "Test Artikel 1", 10, 5.0);
        assertEquals(10, a1.getBestand());

        // Test that the method throws an exception for invalid input
        assertThrows(IllegalArgumentException.class, () -> a1.bucheZugang(-1));
    }

    /**
     * Test bucheAbgang works correctly
     */
    @Test
    public void testBucheAbgangOhneFehler() {
        Artikel a1 = new Artikel(1000, "Test Artikel 1", 10, 5.0);
        assertEquals(10, a1.getBestand());

        a1.bucheAbgang(5);
        assertEquals(5, a1.getBestand(), 0.001);

    }

    /**
     * Test bucheAbgang throw an Exception if the value is not valid
     */
    @Test
    public void testBucheAbgangMitFehler() {
        Artikel a1 = new Artikel(1000, "Test Artikel 1", 10, 5.0);
        assertEquals(10, a1.getBestand());

        // Test that the method throws an exception for invalid input
        assertThrows(IllegalArgumentException.class, () -> a1.bucheAbgang(-1));
    }

}
       

