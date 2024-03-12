import org.testng.Assert;
import org.testng.annotations.Test;

import static org.example.Main.*;

public class MainTest {
    @Test
    public void testDoesContain(){
        Assert.assertEquals(doesContain("abc", 'a'), true);
        Assert.assertEquals(doesContain(null, 'a'), false);
        Assert.assertEquals(doesContain("abc", ' '), false);
        Assert.assertEquals(doesContain("abc", 'z'), false);
        Assert.assertEquals(doesContain("qwe", '%'), false);
        Assert.assertEquals(doesContain("abc", 'A'), false);
    }
    @Test
    public void testReverseString(){
        Assert.assertEquals(reverseString("abc"), "cba");
        Assert.assertEquals(reverseString(null), null);
        Assert.assertEquals(reverseString("0987"), "7890");
    }
    @Test
    public void testGetRound() {
        Assert.assertEquals(getRound(null), 0);
        Assert.assertEquals(getRound(3.5), 4);
        Assert.assertEquals(getRound(3.8), 4);
        Assert.assertEquals(getRound(3.4), 3);
        Assert.assertEquals(getRound(3.0), 3);
        Assert.assertEquals(getRound(- 3.7), - 4);
        Assert.assertEquals(getRound(3.49999999), 3);
    }
}
