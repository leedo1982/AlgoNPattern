import java.util.Scanner;

public class BaekJoon1008 {
   //첫째 줄에 A/B를 출력한다. 절대/상대 오차는 10-9 까지 허용한다.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();

        System.out.println( (double) a / b);
    }
}
