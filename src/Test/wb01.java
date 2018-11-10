package Test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class wb01 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String input2 = br.readLine();

        int[] arrNum = stringArrToIntArr(input.split(" "));
        int sum = Integer.valueOf(input2);
        Set<String> result = new HashSet<>();

        int count = 0;
        for (int i = 0; i < arrNum.length - 2; i++) {
            for (int j = i + 1; j < arrNum.length - 1; j++) {
                for (int k = j + 1; k < arrNum.length; k++) {
                    String str = arrNum[i] + " " + arrNum[j] + " " + arrNum[k];
                    if ((arrNum[i] + arrNum[j] + arrNum[k]) == sum && !result.contains(str)) {
                        result.add(str);
                        System.out.println(str);
                        count++;
                    }
                }
            }
        }

        if (count == 0) {
            System.out.println("NO");
        }
    }

    private static int[] stringArrToIntArr(String[] s) {
        int[] result = new int[s.length];
        for (int i = 0; i < s.length; i++) {
            result[i] = Integer.parseInt(s[i]);
        }
        Arrays.sort(result);

        return result;
    }
}
