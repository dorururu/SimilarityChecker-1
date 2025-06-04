public class SimilarityChecker {

    public int getLengthScore(String A, String B) {
        int lengthA = A.length();
        int lengthB = B.length();

        if (lengthA > lengthB) {
            return calcScoreByLength(lengthA, lengthB);
        } else if (lengthA < lengthB) {
            return calcScoreByLength(lengthB, lengthA);
        } else {
            return 60;
        }
    }

    private int calcScoreByLength(int bigNumberLength, int smallNumberLength) {
        if (bigNumberLength >= smallNumberLength * 2) {
            return 0;
        }

        int gap = bigNumberLength - smallNumberLength;
        double result = (1 - (double) gap / smallNumberLength) * 60;
        return (int) result;
    }

}
