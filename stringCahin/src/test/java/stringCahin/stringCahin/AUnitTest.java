package stringCahin.stringCahin;
import static org.junit.Assert.*;

import org.junit.Test;

public class AUnitTest {
    @Test
    public void testAWithStub() {
        // יוצרים סטאב של B
        BStub stub = new BStub();
        // יוצרים את A עם הסטאב
        A a = new A(stub);
        // קוראים ל־A — לא לסטאב!
        String result = a.process("H");
        // מאמתים את הפלט
        assertEquals("HX", result);
}
}