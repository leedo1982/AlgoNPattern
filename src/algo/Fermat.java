package algo;

public class Fermat {
    // 페르마의 소정리
    // a = 색상의 개수
    // p = 소수인 줄의 길이
    // ahens wnfdml rottnsms (a^p - a)/p
    // a^p = a mod p

    public static void main(String[] args) {

        calculate c = new calculate();
        c.factorial(10);

        System.out.println("result ==" + c);
    }

}

class calculate {

    int[] Arr = new int[20003];

    int DIVISOR = 1000000007;

    public int factorial(int a) {
        for (int i = 0; i <= a; i++) {
            if (i >= 1) {
                Arr[i] = i * Arr[i - 1] % DIVISOR;
            } else {
                Arr[i] = 1;
            }
        }

        System.out.println("num =="+ Arr[a]);

        return Arr[a];

    }
}

