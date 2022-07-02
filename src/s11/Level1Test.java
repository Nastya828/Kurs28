package s11;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class Level1Test {

    @Test
    void patternUnlock() {
        Assertions.assertEquals(Level1.BigMinus("34", "1234567891"), "1234567857");
    }
}