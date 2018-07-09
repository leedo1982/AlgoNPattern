package codility;

import java.util.Stack;

public class Fish {


    public int solution(int[] A, int[] B) {

        Stack<Integer> fish = new Stack<>();

        for (int i = 0; i < A.length; i++) {
            int sign = B[i] == 0 ? 1 : -1;
            if (fish.size() == 0) {
                fish.push(A[i] * sign);
            } else {
                for (int j = 0; j < fish.size(); j++) {
                    if (fish.peek() < 0 && A[i] * sign > 0) {
                        if (fish.peek() * -1 < A[i] * sign) {
                            fish.pop();
                        }
                        fish.push(A[i] * sign);
                    }
                }
            }
        }
        return fish.size();
    }
}