import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestClass {

    @Test
    public void test_True(){
        int[] a = {121, 144, 19, 161, 19, 144, 19, 11};
        int[] b = {121, 14641, 20736, 361, 25921, 361, 20736, 361};
        Main main = new Main();
        assertTrue(main.comp(a,b));
    }

    @Test
    public void test_False(){
        int[] a = {121, 144, 19, 161, 19, 144, 19, 11};
        int[] b = {121, 14641, 20736, 367, 25921, 361, 20736, 361};
        Main main = new Main();
        assertFalse(main.comp(a,b));
    }

}
