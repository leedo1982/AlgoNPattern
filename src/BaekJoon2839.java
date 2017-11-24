import java.util.Scanner;

public class BaekJoon2839 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int result = -1;

        int loopNum = N / 5;

        for(int i = loopNum; i >= 0 ; i--) {
            if((N - (5*i)) % 3  == 0){
               result = i + ((N - (5*i)) / 3) ;
               break;
            }
        }
        System.out.println(result);
    }
}
