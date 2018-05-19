package codility;


import java.util.stream.IntStream;

public class CyclicRotation {
    public int[] solution(int[] A, int K) {
        // write your code in Java SE 8
        int length = A.length;
        if (length == 0) {
            return A;
        }
        int rotation = K % length;
        int[] result = new int[length];

        IntStream.range(0, length).forEach(i -> {
            int newIndex = i + rotation;
            int resultIndex = newIndex < length ? newIndex : newIndex - length;

            result[resultIndex] = A[i];
        });


        return result;
        // [3, 8, 9, 7, 6]
        // K = 3

        // [9, 7, 6, 3, 8]
    }
}
