package BaekJoon;

import java.util.Scanner;

public class BaekJoon11721 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int tLen = str.length();

        for (int i = 0, len = tLen / 10 + 1; i < len; i++) {
            int sIndex = i * 10;
            System.out.println(str.substring(sIndex, 10 + sIndex > tLen ? tLen : 10 + sIndex));
        }

    }
}
