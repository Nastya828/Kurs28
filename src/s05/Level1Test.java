package s05;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
class Level1Test {


    //PatternUnlock(3, [2,1,9]) = '2'
    @Test
    void patternUnlock() {
        Assert.assertEquals(Level1.PatternUnlock(3, new int[]{2, 1, 9}),"2");
    }
}