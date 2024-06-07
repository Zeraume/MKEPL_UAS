import static org.junit.Assert.*;
import uas.mkepl.*;
import org.junit.Test;

public class CodeSmellsExampleTest {

    @Test
    public void testLongMethod() {
        CodeSmellsExample example = new CodeSmellsExample();
        int result = example.longMethod();
        assertEquals(141, result);
    }

    @Test
    public void testHelperClassDoNothing() {
        CodeSmellsExample example = new CodeSmellsExample();
        CodeSmellsExample.Helper helper = example.new Helper();
        helper.doNothing();
        assertTrue(true);
    }

    @Test
    public void testMagicNumbers() {
        int a = 42;
        int b = 58;
        int c = 17;
        int d = 24;
        int sum1 = a + b;
        int sum2 = c + d;
        assertEquals(100, sum1);
        assertEquals(41, sum2);
    }

    @Test
    public void testComments() {
        int a = 42;
        int b = 58;
        int sum = a + b;
        assertEquals(100, sum);
    }
}