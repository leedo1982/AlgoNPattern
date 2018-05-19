package BaekJoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BaekJoon10871 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int num = sc.nextInt();

        List<Integer>  numArr = new ArrayList<>();

        while(numArr.size() != len){
            int arr = sc.nextInt();
            numArr.add(arr);
        }

        String result = "";
        for (int i = 0; i < len; i++) {
            if (num > numArr.get(i)) {
                result += numArr.get(i) + " ";
            }
        }

        System.out.println(result.trim());
    }
}
