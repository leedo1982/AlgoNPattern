package codility;

import java.util.Arrays;

public class MaxProductOfThree {
    public int solution(int[] A) {
        // write your code in Java SE 8
        Arrays.sort(A);

        int len = A.length;
        int result1 = A[0] * A[1] * A[len - 1];
        int result2 = A[len - 1] * A[len - 2] * A[len - 3];

        return result2 > result1 ? result2 : result1;
    }

}
