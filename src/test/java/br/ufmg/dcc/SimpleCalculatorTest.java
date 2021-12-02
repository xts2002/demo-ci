package br.ufmg.dcc;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleCalculatorTest {
  private SimpleCalculator calc;

  @BeforeEach
  public void init(){
    calc = new SimpleCalculator();
  }

  @Test
  public void testAddition1() {
    int expected = 5;
    int result = calc.addition(2,3);
    assertEquals(expected, result);
  }

  @Test
  public void testAddition2() {
    assertEquals(-2, calc.addition(4,-6));
  }


}
