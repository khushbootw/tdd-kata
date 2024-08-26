import org.junit.jupiter.api.Test;

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
}
