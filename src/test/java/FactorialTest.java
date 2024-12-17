
import com.groupeisi.Calculfactoriel;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactorialTest {

    @Test
    public void testFactorialOfZero() {
        // Teste si le factoriel de 0 est égal à 1
        assertEquals(1, Calculfactoriel.calculateFactorial(0), "Le factoriel de 0 doit être 1");
    }

    @Test
    public void testFactorialOfOne() {
        // Teste si le factoriel de 1 est égal à 1
        assertEquals(1, Calculfactoriel.calculateFactorial(1), "Le factoriel de 1 doit être 1");
    }

    @Test
    public void testFactorialOfPositiveNumber() {
        // Teste si le factoriel de 5 est égal à 120
        assertEquals(120, Calculfactoriel.calculateFactorial(5), "Le factoriel de 5 doit être 120");
    }

    @Test
    public void testFactorialOfLargeNumber() {
        // Teste si le factoriel de 10 est égal à 3 628 800
        assertEquals(3628800, Calculfactoriel.calculateFactorial(10), "Le factoriel de 10 doit être 3 628 800");
    }

    @Test
    public void testFactorialWithNegativeNumber() {
        // Le comportement attendu pour les nombres négatifs
        try {
            Calculfactoriel.calculateFactorial(-1);
        } catch (IllegalArgumentException e) {
            assertEquals("Le nombre ne peut pas être négatif", e.getMessage());
        }
    }
}

