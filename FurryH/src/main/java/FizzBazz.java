
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class FizzBazz {

    public static final int MIN_VALUE = 0;
    public static final int MAX_VALUE = 100;
    public static final int FIZZ = 3;
    public static final int BAZZ = 5;

    String calcular(int number) {
        if (number < MIN_VALUE || number > MAX_VALUE) {
            throw new IllegalArgumentException("El numero no esta dentro del rango");
        }

        if (number % FIZZ == 0 && number % BAZZ == 0) {
            return "FIZZBAZZ";
        } else if (number % FIZZ == 0) {
            return "FIZZ";
        } else if (number % BAZZ == 0) {
            return "BAZZ";
        } else {
            return String.valueOf(number);
        }
    }
}