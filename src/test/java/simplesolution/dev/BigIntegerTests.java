package simplesolution.dev;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BigIntegerTests {

    @Test
    @DisplayName("1 + 2 = 3")
    public void addTwosBigIntegerNumber() {
        BigInteger number1 = new BigInteger("1");
        BigInteger number2 = new BigInteger("2");
        BigInteger result = number1.add(number2);
        assertEquals(3, result.intValue(), "1 + 2 = 3");
    }
}
