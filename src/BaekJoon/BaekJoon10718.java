package BaekJoon;

import java.util.Scanner;

public class BaekJoon10718 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLine()) {
            String text = sc.nextLine();
            if (!text.isEmpty() && text.trim().length() == text.length() && text.length() <= 100 ) {
                System.out.println(text);
            }
        }
    }
}
