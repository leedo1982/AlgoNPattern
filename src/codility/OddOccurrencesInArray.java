package codility;

import java.util.Arrays;

public class OddOccurrencesInArray {
    public int solution(int[] A) {
//performance fail
//        int max = Arrays.stream(A).max().getAsInt();
//        int[] temp = new int[max + 1];
//
//        Arrays.stream(A).forEach(num ->
//        {
//            if (temp[num] == 0) {
//                temp[num] = 1;
//            } else {
//                temp[num] = 0;
//            }
//        });
//
//        int result = 0;
//        for (int i = 1; i < temp.length; i++) {
//            if (temp[i] == 1) {
//                result = i;
//            }
//        }

        Arrays.sort(A);
        int result = 0;
        for (int i = 0; i < A.length; i++) {

            if (i % 2 == 0) {
                result += A[i];
            } else {
                result -= A[i];
            }
        }

        return result;
    }
}

// 9,3,9,3,9,7,9