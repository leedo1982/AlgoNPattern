package codility;

public class MaxCounter {
    public int[] solution(int N, int[] A) {
        // write your code in Java SE 8
        // Correctness: 100%, Performance: 80%
        //        int[] result = new int[N];
        //        int maxNum = 0;
        //        int maxSum = 0;
        //
        //        for (int i = 0, len = A.length; i < len; i++) {
        //            if (A[i] == N + 1) {
        //                maxSum += maxNum;
        //                maxNum = 0;
        //                result = new int[N];
        //            } else {
        //                result[A[i] - 1]++;
        //                if (result[A[i] - 1] > maxNum) {
        //                    maxNum = result[A[i] - 1];
        //                }
        //            }
        //        }
        //
        //        for (int i = 0, len = result.length; i < len; i++) {
        //            result[i] += maxSum;
        //        }


        // Correctness: 100%, Performance: 100%
        int[] result = new int[N];
        final int[] zeroedArray = new int[N];
        int maxNum = 0;
        int maxSum = 0;

        for (int i = 0, len = A.length; i < len; i++) {
            if (A[i] == N + 1) {
                maxSum += maxNum;
                maxNum = 0;
                System.arraycopy(zeroedArray, 0, result, 0, zeroedArray.length);
            } else {
                if (++result[A[i] - 1] > maxNum) {
                    maxNum = result[A[i] - 1];
                }
            }
        }

        for (int i = 0, len = result.length; i < len; i++) {
            result[i] += maxSum;
        }

        return result;
    }
}
