package exam;

import static junit.framework.TestCase.assertEquals;

import org.junit.Test;

public class DollarTest {

  @Test
  public void testMultiplication() {
    Dollar five = new Dollar(5);
    Dollar dollar = five.times(2);
    assertEquals(10, dollar.amount);

    Dollar dollar1 = five.times(3);
    assertEquals(15, dollar1.amount);

  }

  @Test
  public void testEquality() {
    assertEquals(true,
        new Dollar(5).equals(new Dollar(5)));
    assertEquals(false,
        new Dollar(5).equals(new Dollar(6)));

  }

}
