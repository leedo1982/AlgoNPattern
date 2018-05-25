package codility;

public class TapeEquilibrium {
    public int solution(int[] A) {
        // write your code in Java SE 8
        // Correctness 100%, Performance 66%
        //        int sum = IntStream.of(A).sum();
        //        int min = Math.abs(2 * A[0] - sum);
        //        int sSum = A[0];
        //
        //        for (int i = 1, len = A.length; i < len-1; i++) {
        //            sSum += A[i];
        //            int diff = Math.abs(2 * sSum - sum);
        //            if (diff < min) {
        //                min = diff;
        //            }
        //        }
        // Correctness 100%, Performance 100%
        int sum = 0;
        for (int i : A) {
            sum += i;
        }

        int min = Math.abs(2 * A[0] - sum);
        int sSum = A[0];

        for (int i = 1, len = A.length; i < len - 1; i++) {
            sSum += A[i];
            int diff = Math.abs(2 * sSum - sum);
            if (diff < min) {
                min = diff;
            }
        }

        return min;
    }
}
