package br.ufmg.dcc;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SimpleCalculatorTest {
  @Test
  public void testAddition1() {
    SimpleCalculator calc = new SimpleCalculator();
    int expected = 5;
    int result = calc.addition(2,3);
    assertEquals(expected, result);
  }

  @Test
  public void testAddition2() {
    SimpleCalculator calc = new SimpleCalculator();
    assertEquals(-2, calc.addition(4,-6));
  }
}
