public class SimilarityChecker {

    private static final int MAX_SCORE = 60;

    public int getLengthScore(String A, String B) {
        int lengthA = A.length();
        int lengthB = B.length();

        if (lengthA == lengthB) {
            return MAX_SCORE;
        }

        return calcScoreByLength(lengthA, lengthB);
    }

    private int calcScoreByLength(int lengthA, int lengthB) {
        int bigNumberLength = Math.max(lengthA, lengthB);
        int smallNumberLength = Math.min(lengthA, lengthB);

        if (bigNumberLength >= smallNumberLength * 2) {
            return 0;
        }

        int gap = bigNumberLength - smallNumberLength;
        double result = (1 - (double) gap / smallNumberLength) * MAX_SCORE;
        return (int) result;
    }

}
