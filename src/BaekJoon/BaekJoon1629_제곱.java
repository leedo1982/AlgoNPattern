package BaekJoon;

/**
 * (A^B)/C 로 만들기
 */
public class BaekJoon1629_제곱 {

    public static void main(String[] ar) {
        long a = 2;
        long n = 6;

        long result = 1;
        long multiply = a;
        while (n > 0) {
            if (n % 2 == 1) {
                result *= multiply;
            }
            multiply = multiply * multiply;
            n /= 2;
        }
        System.out.print("result = " + result);
    }
}
