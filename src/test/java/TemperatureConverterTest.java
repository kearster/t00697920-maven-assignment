import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TemperatureConverterTest {

    private final TemperatureConverter tempConv = new TemperatureConverter();
    @Test
    void testCelsiusToFahrenheit() {
        assertEquals(50, tempConv.celsiusToFahrenheit(10));
    }

    @Test
    void testFahrenheitToCelsius() {
        assertEquals(35, tempConv.fahrenheitToCelsius(95));
    }

    @Test
    void testCelsiusToKelvin() {
        assertEquals(373.15, tempConv.celsiusToKelvin(100));
    }
}
