package BaekJoon;

import java.util.*;

public class BaekJoon1924 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        Map<Integer, Integer> calMap = new HashMap<>();
        calMap.put(1,31);
        calMap.put(2,28);
        calMap.put(3,31);
        calMap.put(4,30);
        calMap.put(5,31);
        calMap.put(6,30);
        calMap.put(7,31);
        calMap.put(8,31);
        calMap.put(9,30);
        calMap.put(10,31);
        calMap.put(11,30);
        calMap.put(12,31);

        Map<Integer, String> dayMap = new HashMap<>();
        dayMap.put(0,"SUN");
        dayMap.put(1,"MON");
        dayMap.put(2,"TUE");
        dayMap.put(3,"WED");
        dayMap.put(4,"THU");
        dayMap.put(5,"FRI");
        dayMap.put(6,"SAT");

        if( 1 <= x && x <=12 && 1 <= y && y <=31){
            int sumDay = 0;
            for(int i = 1 ; i < x ; i++){
                sumDay +=calMap.get(i);
            }
            sumDay+=y;

            System.out.println(dayMap.get(sumDay % 7));
        }
    }
}
