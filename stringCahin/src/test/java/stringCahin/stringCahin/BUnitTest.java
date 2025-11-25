package stringCahin.stringCahin;
import org.junit.Test;
import static org.junit.Assert.*;
public class BUnitTest {
    @Test // זה כן מצא בבדיקה
    public void testWithBStub(){
        CStub stub=new CStub();
        B b=new B(stub);
        String result=b.process("H");
        assertEquals("HEX", result);
    }
    @Test //זה לא מצא בבדיקה
    public void testBWithCStub2(){
        CStub2 stub=new CStub2();
        B b=new B(stub);
        String result=b.process("H");
        assertEquals("HE", result);
}}
