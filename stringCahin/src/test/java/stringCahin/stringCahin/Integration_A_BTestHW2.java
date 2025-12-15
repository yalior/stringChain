package stringCahin.stringCahin;
import org.junit.Test;
import static org.junit.Assert.*;
public class Integration_A_BTestHW2 {
    class IntegrationStubC extends C {
        public IntegrationStubC() {
            super(null);
        }
        @Override
        public String process(String prefix) {
            return prefix + "L";
        }
    }
    @Test
    public void testIntegraionFlowAB() {
        IntegrationStubC stubC = new IntegrationStubC();
        B b = new B(stubC);
        A a= new A(b);
        String result=a.process("");
        assertEquals("HEL", result);
    }
}
