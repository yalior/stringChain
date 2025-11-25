package stringCahin.stringCahin;



public class B {
   private C next;

   public B(C next) {
      this.next = next;
   }

   public String process(String prefix) {
      String update = next.process(prefix + "E");
         return prefix + "E";    }
   }
