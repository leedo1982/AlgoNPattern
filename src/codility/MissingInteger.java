package codility;

public class MissingInteger {
    public int solution(int[] A) {
        // write your code in Java SE 8
        // Correctness : 100%, Performance :  100%
        int len = A.length;
        int size = A.length;

        for (int i = 0; i < len; i++) {
            if (size < A[i]) {
                size = A[i];
            }
        }

        boolean[] bArr = new boolean[size + 1];
        for (int i = 0; i < len; i++) {
            int num = A[i];
            if (num > 0) {
                bArr[num] = true;
            }
        }

        int result = size + 1;
        for (int i = 1, bLen = bArr.length; i < bLen; i++) {
            if (!bArr[i]) {
                result = i;
                break;
            }
        }

        return result;

    }
}
