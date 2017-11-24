import java.util.Scanner;

public class BaekJoon11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String num = sc.next();
        int sum = 0;

        if (1 <= N && N <= 100 && num.length() == N) {
            String[] res = num.split("");
            for(int i = 0 ; i < N ; i++){
                sum += Integer.parseInt(res[i]);
            }

            System.out.println(sum);
        }
    }
}
