package codility;

public class FromJmp {
    public int solution(int X, int Y, int D) {
        // Detected time complexity: O(Y-X)
        // int distance = 0;
        //
        // int cnt = 0;
        // while (distance < Y) {
        //  distance = X + D * ++cnt;
        // }

        // Detected time complexity: O(1)
        int cnt = (Y - X) / D + ((Y - X) % D > 0 ? 1 : 0);

        return cnt;

    }
}
