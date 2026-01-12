import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void testAddition() {
        int a = 6;
        int b = 7;
        assertEquals(13, a + b);
    }
}
