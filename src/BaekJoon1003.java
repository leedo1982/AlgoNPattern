public class BaekJoon1003 {
    public static void main(String[] args) {
        fibonacci(1);
    }


    public static int fibonacci(int n) {
        if (n == 0) {
            System.out.println("0");
            return 0;
        } else if (n == 1) {
            System.out.println("1");
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
