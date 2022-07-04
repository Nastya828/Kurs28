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
       Assertions.assertFalse(Level1.TankRush(0, 0, "", 0, 0, ""));
    }
}