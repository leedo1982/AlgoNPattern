package codility;

public class PassingCars {
    public int solution(int[] A) {
        // write your code in Java SE 8
        // Correctness: 100%, Performance: 100%
        int zCnt = 0;
        for (int i = 0, len = A.length; i < len; i++) {
            if (A[i] == 0) {
                zCnt++;
            }
        }
        int pairCnt = 0;
        int cnt = 0;
        for (int i = 0, len = A.length; i < len; i++) {

            if (A[i] == 0) {
                cnt++;
                pairCnt += ((len - 1 - i) - (zCnt - cnt));
            }
            if (pairCnt > 1000000000) {
                pairCnt = -1;
                break;
            }
        }

        return pairCnt;
    }
}
