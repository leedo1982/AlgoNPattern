package BaekJoon;

import java.util.Scanner;

public class BaekJoon2441 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        if (1 <= N && N <= 100) {
            String star = "";
            for (int i = 1; i <= N; i++) {
                star += "*";
            }
            for (int y = 0; y < N; y++) {
                String empty = "";
                for (int z = N - y; z < N; z++) {
                    empty += " ";
                }
                System.out.println(empty + star.substring(0, N - y));
            }
        }
    }
}
