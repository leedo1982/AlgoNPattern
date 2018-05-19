package BaekJoon;

import java.util.Scanner;

public class BaekJoon8393 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (1 <= n && n <= 10000) {
            System.out.println(n * (n + 1) / 2);
        }
    }
}
