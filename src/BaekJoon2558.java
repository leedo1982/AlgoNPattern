import java.util.Scanner;

public class BaekJoon2558 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, result;
        a = sc.nextInt();
        b = sc.nextInt();
        result = a + b;

        if (0 < a && a < 10
         && 0 < b && b < 10
         && result < 10 ) {
            System.out.println(result);
        }
    }
}
