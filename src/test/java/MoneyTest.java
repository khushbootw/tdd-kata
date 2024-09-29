import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MoneyTest {

    @Test
    public void testDollarMultiplication() {
        Dollar five = new Dollar(5);
        assertEquals(new Dollar(10), five.times(2));
        assertEquals(new Dollar(15), five.times(3));
    }

    @Test
    public void testFrancMultiplication() {
        Franc five = new Franc(5);
        assertEquals(new Franc(10), five.times(2));
        assertEquals(new Franc(15), five.times(3));
    }

    @Test
    public void testDollarEquality() {
        Dollar five = new Dollar(5);
        Dollar anotherFive = new Dollar(5);

        assertTrue(five.equals(anotherFive));
        assertFalse(five.equals(new Dollar(10)));
    }

    @Test
    public void testFrancEquality() {
        Franc five = new Franc(5);
        Franc anotherFive = new Franc(5);

        assertTrue(five.equals(anotherFive));
        assertFalse(five.equals(new Franc(10)));
    }
}
