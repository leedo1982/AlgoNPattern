package codility;

import java.util.Arrays;
import java.util.Comparator;

public class NumberOfDiscIntersections {
    public static int solution2(int[] A) {
        class Circle {
            public long min;
            public long max;
        }

        int N = A.length;
        Circle[] circles = new Circle[N];

        for (int i = 0; i < N; i++) {
            Circle circle = new Circle();
            circle.min = Math.max((long) i - A[i], 0);
            circle.max = Math.min((long) i + A[i], N);
            circles[i] = circle;
        }

        Arrays.sort(circles, (o1, o2) -> {
            if (o1.min > o2.min) {
                return 1;
            } else {
                return -1;
            }
        });

        int count = 0;
        for (int i = 0; i < N - 1; i++) {
            long max = circles[i].max;
            for (int j = i + 1; j < N && circles[j].min <= max; j++) {
                count++;
                if (count > 10E6) {
                    return -1;
                }
            }
        }

        return count;
    }

    public static int solution100(int[] A) {
        class Circle {
            long min;
            long max;
        }
        int N = A.length;
        Circle[] circles = new Circle[N];
        for (int i = 0; i < N; i++) {
            Circle circle = new Circle();
            circle.min = (long) i - A[i];
            circle.max = (long) i + A[i];
            circles[i] = circle;
        }
        Arrays.sort(circles, new Comparator<Circle>() {
            @Override
            public int compare(Circle o1, Circle o2) {
                if (o1.min > o2.min) {
                    return 1;
                } else {
                    return -1;
                }
            }
        });
        int count = 0;
        for (int i = 0; i < N - 1; i++) {
            for (int j = i + 1; j < N && circles[i].max >= circles[j].min; j++) {
                count++;
                if (count > 10E6) {
                    return -1;
                }
            }
        }
        return count;
    }

    public int solution3(int[] A) {
        class Circle {
            public long min;
            public long max;
        }

        int N = A.length;
        Circle[] circles = new Circle[N];
        for (int i = 0; i < N; i++) {
            Circle circle = new Circle();
            circle.min = Math.max((long) i - A[i], 0);
            circle.max = Math.min((long) i + A[i], N);
            circles[i] = circle;
        }

        Arrays.sort(circles, (o1, o2) -> {
            if (o1.min > o2.min) {
                return 1;
            } else {
                return -1;
            }
        });

        int cnt = 0;
        for (int i = 0; i < N - 1; i++) {
            long max = circles[i].max;
            for (int j = i + 1; j < N; j++) {
                if (max >= circles[j].min) {
                    cnt++;
                }
                if (cnt > 10000000) {
                    return -1;
                }
            }
        }
        return cnt;
    }

    public int solution(int[] A) {
        // write your code in Java SE 8

        int N = A.length;
        long[][] circleArr = new long[N][1];
        for (int i = 0; i < N; i++) {
            long min = Math.max((long) i - A[i], 0);
            long max = Math.min((long) i + A[i], N);
            long[] circle = new long[]{min, max};
            circleArr[i] = circle;
        }
        Arrays.sort(circleArr, (o1, o2) -> {
            if (o1[0] > o2[0]) {
                return 1;
            } else {
                return -1;
            }
        });

        int cnt = 0;
        for (int i = 0; i < N - 1; i++) {
            long max = circleArr[i][1];
            for (int j = i + 1; j < N; j++) {
                if (max >= circleArr[j][0]) {
                    cnt++;
                }
                if (cnt > 10000000) {
                    return -1;
                }
            }
        }
        return cnt;
    }

}
