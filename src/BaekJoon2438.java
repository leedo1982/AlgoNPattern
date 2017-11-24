import java.util.Scanner;

public class BaekJoon2438 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        if (1 <= N && N <= 100) {
            String star = "";
            for (int i = 1; i <= N; i++) {
                System.out.println(star += "*");
            }
        }
    }
}
