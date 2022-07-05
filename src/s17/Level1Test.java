package s17;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Level1Test {

    @Test
    void lineAnalysis() {

        Assertions.assertTrue(Level1.LineAnalysis("*..*..*"));
        Assertions.assertTrue(Level1.LineAnalysis("**"));
        Assertions.assertTrue(Level1.LineAnalysis("*"));
        Assertions.assertFalse(Level1.LineAnalysis("*..*...*..*..*..*..*"));
        Assertions.assertFalse(Level1.LineAnalysis("*..*..*..*..*..**..*"));
        Assertions.assertTrue(Level1.LineAnalysis("***"));
        Assertions.assertFalse(Level1.LineAnalysis("*.......*......."));
        Assertions.assertTrue(Level1.LineAnalysis("*.*"));
        Assertions.assertFalse(Level1.LineAnalysis("."));
        Assertions.assertFalse(Level1.LineAnalysis("....*....*"));
        Assertions.assertFalse(Level1.LineAnalysis("....*...."));
        Assertions.assertFalse(Level1.LineAnalysis("...."));
        Assertions.assertFalse(Level1.LineAnalysis("*.*..*.*...*"));
        Assertions.assertFalse(Level1.LineAnalysis("*....*....*....*...*"));
    }
}