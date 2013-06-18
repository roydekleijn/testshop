package initialTest;

import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class SecondTest {
    
    public void helloWorldTest() {
        String s = "hello world";
        Assert.assertEquals(s, "hello world");
    }
    
    public void otherTest() {
        String s = "Other test";
        Assert.assertEquals(s, "Other test");
    }

}