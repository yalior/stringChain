package stringCahin.stringCahin;
import org.junit.Test;
import static org.junit.Assert.*;
public class DUnitTest {
    @Test
    public void testDWithStub() {
        // יוצרים סטאב של E
        EStub stub = new EStub();
        // יוצרים את D עם הסטאב
        D d = new D(stub);

        // קוראים ל־D — לא לסטאב!
        String result = d.process("HEL");

        // מאמתים את הפלט
        assertEquals("HELLX", result);
    }
    
}
