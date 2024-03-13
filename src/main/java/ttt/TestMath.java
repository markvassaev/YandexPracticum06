package ttt;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class TestMath {
    @Test
    public void TestFactorial(){
        Math math = new Math();
//        Assert.assertEquals(720,math.factorial(6));
        Assert.assertEquals(0,math.sin(0),0.01);
    }
}
