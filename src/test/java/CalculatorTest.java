import static org.junit.Assert.*;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testFindMax(){
        assertEquals(4,Calculator.findMax(new int[]{1,3,4,2}));
        assertNotEquals(-1,Calculator.findMax(new int[]{-12,-1,-3,-4,-2}));
    }
}
