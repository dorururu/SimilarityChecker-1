public class SimilarityChecker {

    public int getLengthScore(String A, String B) {
        int lengthA = A.length();
        int lengthB = B.length();
        int gap = 0;
        int result = 0;

        if (lengthA > lengthB) {
            if (lengthA >= lengthB * 2) {
                return 0;
            }

            gap = lengthA - lengthB;
            result = (1 - gap/lengthB) * 60;

        } else if (lengthA < lengthB) {
            if (lengthB >= lengthA * 2) {
                return 0;
            }

            gap = lengthB - lengthA;
            result = (1 - gap/lengthA) * 60;
        } else {
            return 60;
        }

        return result;
    }
}
