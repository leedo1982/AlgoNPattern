package codility;

public class NumberOfDiscIntersections {
    public int solution(int[] A) {
        // write your code in Java SE 8

        int len = A.length;
        int[][] circleArr = new int[len][1];
        for (int i = 0; i < len; i++) {
            int min = i - A[i];
            int max = i + A[i];
            int[] circle = new int[]{min, max};
            circleArr[i] = circle;
        }

        int cnt = 0;
        for (int i = 0; i < len - 1; i++) {
            for (int j = i + 1; j < len && circleArr[i][1] >= circleArr[j][0]; j++) {

                System.out.println("i : " + i + "j : " + j + "cnt : " + cnt);


                cnt++;
                if (cnt > 10000000) {
                    return -1;
                }
            }
        }


        return cnt;
    }


}
