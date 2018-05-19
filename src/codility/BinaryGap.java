package codility;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class BinaryGap {
    public int solution(int N) {
        String binaryString = Integer.toBinaryString(N);

        Pattern p = Pattern.compile("(0+)1");  // Non-Greedy
        Matcher match = p.matcher(binaryString);

        int max = 0;
        while (match.find()) {
            int num = match.group().length() - 1;
            if (num > max) {
                max = num;
            }
        }

        return max ;
    }
}
