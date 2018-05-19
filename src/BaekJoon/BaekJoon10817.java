package BaekJoon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BaekJoon10817 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        List<Integer> numList = new ArrayList<>(Arrays.asList(num1, num2, num3));
        numList.sort(Integer::compareTo);

        System.out.println(numList.get(1));

    }
}
