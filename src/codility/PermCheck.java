package codility;

public class PermCheck {

    public int solution(int[] A) {
        // write your code in Java SE 8

        // Correctness: 83%, Performance: 66%
        // [1,4,1]
        //        long len = A.length;
        //        long sum = len * (len + 1) / 2;
        //        long resultSum = 0;
        //
        //        for (int i = 0; i < (int) len; i++) {
        //            resultSum += A[i];
        //        }
        //
        //        return sum == resultSum ? 1 : 0;

        int len = A.length;
        long sum = (long) len * (len + 1) / 2;
        long resultSum = 0;

        boolean[] bArr = new boolean[len];

        for (int i = 0; i < len; i++) {
            int num = A[i];
            if (bArr.length >= num && !bArr[num - 1]) {
                resultSum += num;
                bArr[num - 1] = true;
            }
        }

        return sum == resultSum ? 1 : 0;
    }

}
