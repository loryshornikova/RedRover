import org.testng.Assert;
import org.testng.annotations.Test;

import static org.example.Main.getSum;

public class MainTest {
        @Test
        public void testGetSum(){
                        Assert.assertEquals(getSum(0, 0), 0);
                Assert.assertEquals(getSum(5, 5), 10);
                Assert.assertEquals(getSum(-1, -3), -4);
                Assert.assertEquals(getSum(-1, 3), 2);
                Assert.assertEquals(getSum(100, 100), 200);
    }
}
