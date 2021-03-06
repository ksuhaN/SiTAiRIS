package TrapezeTest;
import org.junit.BeforeClass;
import Trapeze.Trapeze;
import org.junit.Test;
import java.security.InvalidParameterException;

import static org.junit.Assert.*;

public class TrapezeTest {
    private static Trapeze trapeze;

    @BeforeClass
    public static void createTrapeze(){
        trapeze = new Trapeze();
    }

    @Test(expected = InvalidParameterException.class)
    public void testPerimeterException() {
        trapeze.perimeter(-1, 0, 12, 3);
    }
    
  
    @Test(expected = InvalidParameterException.class)
    public void testPerimeterException1() {
        trapeze.perimeter(0, -1, 12, 3);
    }
    
    @Test(expected = InvalidParameterException.class)
    public void testPerimeterException2() {
        trapeze.perimeter(5, 0, 12, 3);
    }
    
    @Test(expected = InvalidParameterException.class)
    public void testPerimeterException3() {
        trapeze.perimeter(1, 3, 12, -1);
    }
    
    
    
    @Test
    public void testPerimeterTrue() {
        assertTrue(trapeze.perimeter(1, 2, 3, 4) == 10);
    }

    @Test
    public void testPerimeterFalse() {
        assertFalse(trapeze.perimeter(6, 2, 7, 4) != 19);
    }

    @Test(expected = InvalidParameterException.class)
    public void testSquareException() {
        trapeze.square(-1, 0, 12);
    }

    @Test
    public void testSquareTrue() {
        assertTrue(trapeze.square(2, 5, 1) == 3.5);
    }

    @Test
    public void testSquareFalse() {
        assertTrue(trapeze.square(4, 5, 2) != 4.5);
    }
}