public class BaekJoon1003 {

    static int zCnt = 0;
    static int oCnt = 0;

    public static void main(String[] args) {
<<<<<<< HEAD
        fibonacci(1);
    }
=======
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();
>>>>>>> 8d0d107cdacb6ff11df085e1a1115badb5a10bbb

        for(int i = 0 ; i < T ; i++){
            int y ;
            y = sc.nextInt();
            fibonacci(y);
            System.out.println(zCnt+ " "+ oCnt);
            zCnt = 0;
            oCnt = 0;
        }
    }

    public static int fibonacci(int n) {
        if (n == 0) {
<<<<<<< HEAD
            System.out.println("0");
            return 0;
        } else if (n == 1) {
            System.out.println("1");
=======
            zCnt++;
            return 0;
        } else if (n == 1) {
            oCnt++;
>>>>>>> 8d0d107cdacb6ff11df085e1a1115badb5a10bbb
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
