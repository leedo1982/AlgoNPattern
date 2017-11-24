import java.util.Scanner;

public class BaekJoon10430 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A, B, C;
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();

        if (2 <= A && A <= 10000 &&
            2 <= B && B <= 10000 &&
            2 <= C && C <= 10000) {
            System.out.println((A + B) % C);
            System.out.println((A % C + B % C) % C);
            System.out.println((A * B) % C);
            System.out.println((A % C * B % C) % C);
        }
    }
}
