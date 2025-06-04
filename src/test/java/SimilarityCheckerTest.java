import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimilarityCheckerTest {

    @Test
    void checkStringLength() {
        SimilarityChecker checker = new SimilarityChecker();

        int score = checker.getLengthScore("ASD", "DSA");

        assertEquals(60, score);
    }
}