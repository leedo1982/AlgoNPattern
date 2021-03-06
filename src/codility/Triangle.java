package codility;

import java.util.Arrays;

public class Triangle {

    public int solution(int[] A) {
        Arrays.sort(A);

        for (int i = 0, len = A.length; i < len - 2; i++) {
            if ((double)A[i] + (double)A[i + 1] > A[i + 2]) {
                return 1;
            }
        }
        return 0;
    }

}
