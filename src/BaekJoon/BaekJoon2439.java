package BaekJoon;

import java.util.Scanner;

public class BaekJoon2439 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        if (1 <= N && N <= 100) {
            String star = "";
            for (int i = 1; i <= N; i++) {
                String empty = "";
                star += "*";
                for (int y = i; y < N; y++) {
                    empty += " ";
                }
                System.out.println(empty + star);
            }
        }
    }
}
