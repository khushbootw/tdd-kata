import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MoneyTest {

  @Test
  public void testMultiplication() {
    Dollar five = new Dollar(5);

    Dollar ten = five.times(2);
    assertEquals(10, ten.amount);

    Dollar fifteen = five.times(3);
    assertEquals(15, fifteen.amount);
  }

  @Test
  public void testEquality() {
    Dollar five = new Dollar(5);
    Dollar anotherFive = new Dollar(5);

    assertTrue(five.equals(anotherFive));
    assertFalse(five.equals(new Dollar(10)));
  }
}
