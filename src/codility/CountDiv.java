package codility;

public class CountDiv {
    public int solution(int A, int B, int K) {
        // write your code in Java SE 8
        int aDiv = (A - 1) / K;
        int bDiv = B / K;
        return bDiv - aDiv;
    }
}
