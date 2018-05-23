package codility;

public class Main {

    public static void main(String[] args) {
        //        BinaryGap bg = new BinaryGap();
        //        System.out.println("bg =="+bg.solution(15));

        //        CyclicRotation cr = new CyclicRotation();
        //        int[] a  = {3, 8, 9, 7, 6};
        //        System.out.println("cr =="+cr.solution(a, 3));

        //        OddOccurrencesInArray ooia = new OddOccurrencesInArray();
        //        ooia.solution(new int[]{9, 3, 9, 3, 9, 7, 9});

        //        FromJmp fj = new FromJmp();
        //        System.out.println(fj.solution(10, 85, 30));
        //        System.out.println(fj.solution(1, 5, 2));
        PermMissingElem pme = new PermMissingElem();

        int[] arr = new int[99999];
        for(int i = 2 ; i <= 100000 ; i++){
            arr[i-2] = i;

        }
//        System.out.println(pme.solution(arr));
        System.out.println(pme.solution(new int[]{2, 3, 1, 5}));


    }
}
