import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MoneyTest {

  @Test
  public void testMultiplication() {
    Dollar five = new Dollar(5);
    assertEquals(new Dollar(10), five.times(2));
    assertEquals(new Dollar(15), five.times(3));
  }

  @Test
  public void testEquality() {
    Dollar five = new Dollar(5);
    Dollar anotherFive = new Dollar(5);

    assertTrue(five.equals(anotherFive));
    assertFalse(five.equals(new Dollar(10)));
  }
}
