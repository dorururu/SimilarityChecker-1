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
        assertEquals(60, checker.getLengthScore("ASD", "DSA"));
    }

    @Test
    void checkStringLengthPartialPoints() {
        assertEquals(20, checker.getLengthScore("AAABB", "BAA"));
    }

    @Test
    void checkStringLengthPartialPoints2() {
        assertEquals(30, checker.getLengthScore("AA", "AAE"));
    }

    @Test
    void checkStringLength0Point() {
        assertEquals(0, checker.getLengthScore("A", "BB"));
    }
}