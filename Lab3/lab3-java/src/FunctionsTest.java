
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.*;

public class FunctionsTest {

    Function fonction;

    @BeforeEach
    public void setUp () {
        fonction = new Function ();
    }

    @Test
    @DisplayName("Addition simple devrait fonctionner")
    public void testAdd () {
        assertEquals(5, fonction.addition(2, 3));
    }

    @Test
    @DisplayName("Soustraction simple devrait fonctionner")
    public void testSub () {
        assertEquals(2, fonction.soustraction(5, 3));
    }

    @AfterEach
    public void apresTout () {
        System.out.println("Le Test testAdd est OK");
    }


}