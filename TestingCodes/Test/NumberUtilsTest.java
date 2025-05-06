package TestingCodes.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import TestingCodes.Codes.NumberUtils;

public class NumberUtilsTest {

    @Test
    public void testIsEven() {
        NumberUtils numberUtils = new NumberUtils();

        assertTrue(numberUtils.isEven(12));

        assertFalse(numberUtils.isEven(11));
    }

    @Test
    public void testIsPrime() {
        NumberUtils numberUtils = new NumberUtils();

        assertTrue(numberUtils.isPrime(5));
        assertTrue(numberUtils.isPrime(4));
        assertFalse(numberUtils.isPrime(0));
    }
    
}
