public class NegativeOneTheRight {

    public int[] negativeOnTheRightAlgorithm(int[] a) {
        int  posCount = 0, negCount = 0;
        int[] posTemp = new int[a.length], negTemp = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0) {
                posTemp[posCount] = a[i];
                posCount++;
            } else if (a[i] < 0) {
                negTemp[negCount] = a[i];
                negCount++;
            } else if (a[i] == 0) {
                continue;
            }
        }
        int[] result = new int[posCount + negCount];
        int resultCount = 0;
        for (int i = 0; i < posCount; i++) {
            result[resultCount++] = posTemp[i];
        }
        for (int i = 0; i < negCount; i++) {
            result[resultCount++] = negTemp[i];
        }
        return result;
    }
}
