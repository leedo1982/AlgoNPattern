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
        //        PermMissingElem pme = new PermMissingElem();
        //        System.out.println(pme.solution(new int[]{2, 3, 1, 5}));
        //        TapeEquilibrium te = new TapeEquilibrium();

        //        System.out.println(te.solution(new int[]{3, 1, 2, 4, 3}))   ;
        //        System.out.println(te.solution(new int[]{-1000, 1000}));
        //        System.out.println(te.solution(new int[]{5, 6, 2, 4, 1}));


        FrogRiverOne fro = new FrogRiverOne();

        System.out.println(fro.solution(5, new int[]{1, 3, 1, 4, 2, 3, 5, 4}));
//        System.out.println(fro.solution(100000, new int[]{1, 3, 1, 4, 2, 3, 5, 4}));

    }
}
