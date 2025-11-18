package stringCahin.stringCahin;
import org.junit.Test;
import static org.junit.Assert.*;
public class SystemTest {
    private A buildChain(){
        E e=new E();
        D d= new D(e);
        C c= new C(d);
        B b= new B(c);
        return new A(b);
    }
    @Test
    public void testSystem_EmptyInput(){
        A a = buildChain();
        String result=a.process("");
        assertEquals("HELLO", result);
    }
    @Test
    public void testSystem_WithPrefix(){
        A a = buildChain();
        String result=a.process("X");
        assertEquals("XHELLO", result);
    }

    @Test
    public void testSystem_NotWrongValue(){
        A a = buildChain();
        String result=a.process("");
        assertNotEquals("HELLO", result);
        assertEquals(5, result.length());
    }
}

