package codility;

public class CountDiv {
    public int solution(int A, int B, int K) {
        // write your code in Java SE 8
        int aDiv = (A == 0 ? A : (A - 1)) / K;
        int bDiv = B / K;
        return A == 0  ? bDiv - aDiv + 1 : bDiv - aDiv;
    }
}
