package BaekJoon;

import java.util.Scanner;

public class BaekJoon2741 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        if (0 < N && N <= 1000000) {
            for (int i = 1; i <= N; i++)
                System.out.println(i);
        }
    }
}
