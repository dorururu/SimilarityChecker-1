import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimilarityCheckerTest {

    SimilarityChecker checker;

    @BeforeEach
    void setUp() {
        checker = new SimilarityChecker();
    }

    @Test
    void checkStringLengthPerfectScore() {
        int score = checker.getLengthScore("ASD", "DSA");
        assertEquals(60, score);
    }

    @Test
    void checkStringLengthPartialPoints() {
        int score = checker.getLengthScore("AAABB", "BAA");
        assertEquals(20, score);
    }

    @Test
    void checkStringLengthPartialPoints2() {
        int score = checker.getLengthScore("AA", "AAE");
        assertEquals(30, score);
    }

    @Test
    void checkStringLength0Point() {
        int score = checker.getLengthScore("ASD", "DSA");
        assertEquals(60, score);
    }
}