package BaekJoon;

import java.util.Scanner;

/**
 * Created by dowon on 2017. 9. 19..
 */
public class BaekJoon11401_이항계수 {
    // 자연수 N 과 정수 K 가 주어졌을 때, 이항계수를 구하고
    // 그 수를 1,000,000,007 로 나눈 나머지ㅡㄹ 구하는 문제
    // 범위 1 <= N <= 4,000,000 0 <= K <= N

    public static void main(String[] ar) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        long p = 1000000007;

        long[] factorial = new long[N + 1];
        factorial[0] = 1;
        factorial[1] = 1;
        // factorial 구하기
        for (int i = 2; i <= N; i++) {
            factorial[i] = (factorial[i - 1] * i) % p;
        }

        long denominator = (factorial[K] * factorial[N - K]) % p;

        // fermatNum(denominator의 K-2 제곱 구하기)
        long index = p - 2;
        long fermatNum = 1;
        while (index > 0) {
            if (index % 2 == 1) {
                fermatNum *= denominator;
                fermatNum %= p;
            }
            denominator = (denominator * denominator) % p;
            index /= 2;
        }
        long result = ((factorial[N] % p) * (fermatNum % p)) % p;
        System.out.print(result);

    }
}
