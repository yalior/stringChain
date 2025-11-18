package stringCahin.stringCahin;
import org.junit.Test;
import static org.junit.Assert.*;
public class B_CIntegrationTest {
    @Test
    public void testBAndCIntegration() {
        // יוצרים סטאב של D
        DStub dStub = new DStub();
        // יוצרים את C עם הסטאב של D
        C c = new C(dStub);
        // יוצרים את B עם C האמיתי
        B b = new B(c);
        //נקודת הפעלה של המבחן
        String result=b.process("X");

        // מאמתים את הפלט
        assertEquals("HELX", result);
        
        //B adds "E" => "HE"
        //C adds "L" => "HEL"
        //DStub adds "X" => "HELX"

    }
    
}
