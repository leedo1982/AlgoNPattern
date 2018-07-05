package codility;

public class Nesting {


    public int solution(String S) {

        if (S.equals("")) {
            return 1;
        } else if (S.charAt(0) != '(' || S.charAt(S.length() - 1) != ')') {
            return 0;
        }

        int o = 0;

        for (int i = 0; i < S.length(); i++) {
            if ('(' == S.charAt(i)) {
                o++;
            } else {
                o--;
            }
            if(o < 0){
                return 0;
            }

        }
        return o == 0 ? 1 : 0;
    }
}
