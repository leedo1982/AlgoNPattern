package codility;

public class MinSliceAvg {

    public int solution(int[] A) {
        // Correctness: 100% Performance: 100
        float resultAvg = (A[0] + A[1]) / 2;
        int minIdx = 0;

        for (int i = 0, len = A.length; i < len; i++) {
            int sum = A[i];
            for (int j = i + 1; j < i + 3; j++) {
                if (j >= len ) {
                    break;
                }
                sum += A[j];
                float avg = (float) sum / (j - i + 1);

                if (resultAvg > avg) {
                    resultAvg = avg;
                    minIdx = i;
                }
            }
        }

        return minIdx;
    }
}
