package s15;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Level1Test {

    @Test
    void tankRush() {
       Assertions.assertTrue(Level1.TankRush(3, 4, "1234 2345 0987", 2, 2, "34 98"));
       Assertions.assertTrue(Level1.TankRush(3, 4, "1234 2345 0987", 1, 2, "34"));
       Assertions.assertFalse(Level1.TankRush(3, 4, "1234 2345 0987", 2, 2, "34 97"));
       Assertions.assertFalse(Level1.TankRush(1, 4, "1234", 2, 4, "1234 2297"));
       Assertions.assertTrue(Level1.TankRush(2, 4, "1234 2297", 2, 4, "1234 2297"));
       Assertions.assertTrue(Level1.TankRush(1, 4, "1234", 1, 1, "2"));
       Assertions.assertFalse(Level1.TankRush(1, 4, "1234", 0, 0, ""));
        int[][] x = {
                {0,2,9,4,0,2},
                {5,6,0,2,0,2},
                {0,2,9,6,9,4},
                {7,8,0,2,8,8}
        };


       Assertions.assertFalse(Level1.TankRush(4,6,"029402 560202 029694 780288",2,2,"03 78"));
       Assertions.assertTrue(Level1.TankRush(4,6,"029402 560202 029694 780288",1,2,"96"));
    }
}