package stringCahin.stringCahin;
import org.junit.Test;
import static org.junit.Assert.*;
public class C_DUIntegrationTest {
    @Test
    public void testCAndDIntegration() {

        EStub estub = new EStub();
        D d= new D(estub);
        C c= new C(d);

        String result=c.process("X");
        assertEquals("HELLX", result);

    }

    
}
