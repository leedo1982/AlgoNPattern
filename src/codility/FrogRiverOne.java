package codility;

public class FrogRiverOne {
    public int solution(int X, int[] A) {
        // write your code in Java SE 8
        // Correctness : 100%, Performance : 100%

        long sum = ((long)X) * (X + 1) / 2;
        boolean[] bArr = new boolean[X];

        int result = -1;

        for (int i = 0, len = A.length; i < len; i++) {
            if (!bArr[A[i] - 1]) {
                sum -= A[i];
                bArr[A[i] - 1] = true;
            }
            if (sum == 0) {
                result = i;
                break;
            }

        }

        return result;
    }
}
