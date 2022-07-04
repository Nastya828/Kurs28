package s16;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Level1Test {

    @Test
    void maximumDiscount() {
        int[] price = {100, 350, 25, 300, 400, 200, 150, 800}; //{800, 400, 350, 300, 200, 150, 100, 25}
        Assertions.assertEquals(Level1.MaximumDiscount(price.length, price),(350+150) );
        Assertions.assertEquals(Level1.MaximumDiscount(2, new int[]{200, 50}),0);
        Assertions.assertEquals(Level1.MaximumDiscount(3, new int[]{200, 50, 100}),50);
        Assertions.assertEquals(Level1.MaximumDiscount(3, new int[]{50, 50, 50}),50);
        Assertions.assertEquals(Level1.MaximumDiscount(4, new int[]{200, 50, 50, 600}),50);
        Assertions.assertEquals(Level1.MaximumDiscount(6, new int[]{200, 200, 200, 200, 200, 200}),400);



    }
}