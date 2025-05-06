package TestingCodes.Test;

import static org.junit.Assert.assertEquals;


import org.junit.Test;

import TestingCodes.Codes.Calculator;

public class CalculatorTest {
   Calculator calculator = new Calculator();

   

   @Test
   public void testAddWithPositiveNumber() {
        assertEquals(calculator.addNumbers(10, 10), 20);
        

   }

   @Test
   public void testAddWithNegativeNumber() {
      assertEquals(calculator.addNumbers(-5, -15), -20);
   }

   @Test
   public void testAddWithZeroNumber() {
      assertEquals(calculator.addNumbers(0, 14), 14);
   }

   @Test
   public void testGetStringLength() {
      assertEquals(10, calculator.getStringLength("Prathamesh"));
   }

}
