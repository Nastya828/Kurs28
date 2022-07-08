package s20_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Level1Test {

    @Test
    void sherlockValidString() {
        Assertions.assertTrue(Level1.SherlockValidString("xyuu"));
        Assertions.assertTrue(Level1.SherlockValidString("xyzaa"));
        Assertions.assertTrue(Level1.SherlockValidString("xxxxxiiiiiooooop"));
        Assertions.assertTrue(Level1.SherlockValidString("xxyyz"));

        Assertions.assertFalse(Level1.SherlockValidString("xyzzz"));
        Assertions.assertFalse(Level1.SherlockValidString("xxyyza"));
        Assertions.assertFalse(Level1.SherlockValidString("xxyyzabc"));


    }
}