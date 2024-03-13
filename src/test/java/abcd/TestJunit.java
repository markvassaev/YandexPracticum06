package abcd;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class TestJunit {

    @Test
    public void shouldGiveTrue(){
        String a = "Елдак";
        int b = 5;
        B b1 = new B();
        String C = b1.testMethod();
        Assertions.assertEquals(a,C, "Твоя кишка теперь как веник");

    }

}

class B{
     String testMethod(){
         return "Шлямбур";
     }
}
class C extends B{


}