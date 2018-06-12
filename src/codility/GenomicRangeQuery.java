package codility;

public class GenomicRangeQuery {
    public int[] solution(String S, int[] P, int[] Q) {
        // Correctness: 100%,  Performance: 0%
        //        String[] temp = new String[P.length];
        //
        //        for (int i = 0, len = P.length; i < len; i++) {
        //            temp[i] = S.substring(P[i], Q[i] + 1);
        //        }
        //
        //        int[] result = new int[P.length];
        //        for (int i = 0, len = temp.length; i < len; i++) {
        //            int factor = 4;
        //            if (temp[i].contains("A")) {
        //                factor = 1;
        //                result[i] = factor;
        //                continue;
        //            }
        //            if (temp[i].contains("C")) {
        //                factor = factor > 2 ? 2 : factor;
        //            }
        //            if (temp[i].contains("G")) {
        //                factor = factor > 3 ? 3 : factor;
        //            }
        //            if (temp[i].contains("T")) {
        //                factor = factor > 4 ? 4 : factor;
        //            }
        //            result[i] = factor;
        //        }

        int[] temp = new int[S.length()];
        int sum = 0;

        for (int i = 0, len = S.length(); i < len; i++) {
            char ch = S.charAt(i);
            if (ch == 'A') {
                temp[i] = sum + 1;
                sum += 1;
            } else if (ch == 'C') {
                temp[i] = sum + 2;
                sum += 2;
            } else if (ch == 'G') {
                temp[i] = sum + 3;
                sum += 3;
            } else if (ch == 'T') {
                temp[i] = sum + 4;
                sum += 4;
            }
        }
        for (int i = 0, len = P.length; i < len; i++) {
            int i1 = temp[Q[i]] - temp[P[i]];

        }

        return null;
    }
}
