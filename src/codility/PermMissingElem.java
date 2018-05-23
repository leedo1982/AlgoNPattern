package codility;


public class PermMissingElem {

    public int solution(int[] A) {
        // write your code in Java SE 8
        int sum = 0;

        for (int i = 0; i < A.length; i++) {
            sum += (i + 1) - A[i];
        }

        return sum + A.length + 1;
    }
}
