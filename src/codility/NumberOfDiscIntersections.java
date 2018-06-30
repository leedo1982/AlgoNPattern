package codility;

public class NumberOfDiscIntersections {
    public int solution(int[] A) {
        // write your code in Java SE 8

        int len = A.length;
        long[][] circleArr = new long[len][1];
        for (int i = 0; i < len; i++) {
            long min = (long)i - A[i];
            long max = (long)i + A[i];
            long[] circle = new long[]{min, max};
            circleArr[i] = circle;
        }

        int cnt = 0;
        for (int i = 0; i < len - 1; i++) {
            for (int j = i + 1; j < len ; j++) {
                if(circleArr[i][1] >= circleArr[j][0]){
                    cnt++;
                }
                if (cnt > 10000000) {
                    return -1;
                }
            }
        }
        return cnt;
    }


}
