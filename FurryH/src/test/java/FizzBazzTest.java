import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FizzBazzTest {

    @Test
    void testMinDomainRange() {
        // Arrange
        FizzBazz fizzBazz = new FizzBazz();
        int minVal = -1;

        // Act + Assert
        assertThrows(IllegalArgumentException.class, () -> fizzBazz.calcular(minVal));
    }

    @Test
    void testMaxDomainRange() {
        // Arrange
        FizzBazz fizzBazz = new FizzBazz();
        int maxVal = 101;

        // Act + Assert
        assertThrows(IllegalArgumentException.class, () -> fizzBazz.calcular(maxVal));
    }

    @Test
    void testNormalNumber() {
        // Arrange
        FizzBazz fizzBazz = new FizzBazz();
        int number = 7;

        // Act
        String result = fizzBazz.calcular(number);

        // Assert
        assertEquals("7", result);
    }

    @Test
    void testFizz() {
        // Arrange
        FizzBazz fizzBazz = new FizzBazz();
        int number = 9;

        // Act
        String result = fizzBazz.calcular(number);

        // Assert
        assertEquals("FIZZ", result);
    }

    @Test
    void testBazz() {
        // Arrange
        FizzBazz fizzBazz = new FizzBazz();
        int number = 10;

        // Act
        String result = fizzBazz.calcular(number);

        // Assert
        assertEquals("BAZZ", result);
    }

    @Test
    void testFizzBazz() {
        // Arrange
        FizzBazz fizzBazz = new FizzBazz();
        int number = 15;

        // Act
        String result = fizzBazz.calcular(number);

        // Assert
        assertEquals("FIZZBAZZ", result);
    }

    @Test
    void testMinValidValue() {
        // Arrange
        FizzBazz fizzBazz = new FizzBazz();
        int number = 0;

        // Act
        String result = fizzBazz.calcular(number);

        // Assert
        assertEquals("FIZZBAZZ", result);
    }

    @Test
    void testMaxValidValue() {
        // Arrange
        FizzBazz fizzBazz = new FizzBazz();
        int number = 100;

        // Act
        String result = fizzBazz.calcular(number);

        // Assert
        assertEquals("BAZZ", result);
    }
}