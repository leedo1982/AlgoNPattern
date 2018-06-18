package codility;

import java.util.HashSet;
import java.util.Set;

public class Distinct {
    public int solution(int[] A) {
        // write your code in Java SE 8
        Set<Integer> s = new HashSet<>();

        for (int i = 0, len = A.length; i < len; i++) {
            s.add(A[i]);
        }

        return s.size();
    }
}
