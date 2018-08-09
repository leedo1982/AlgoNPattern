package BaekJoon;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Created by dowon on 2017. 9. 19..
 */
public class BaekJoon2667_BFS {

    private static int map[][];
    private static boolean isvisited[][];
    static int N;
    private static ArrayList<Integer> list = new ArrayList<>();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String word = input.nextLine();
        N = Integer.parseInt(word);
        map = new int[N][N];
        isvisited = new boolean[N][N];

        for (int i = 0; i < N; i++) {
            word = input.nextLine();
            String arr[] = word.split("");
            for (int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(arr[j]);
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                isvisited[i][j] = false;
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (map[i][j] == 1) {
                    bfs(new POINT(i, j));
                }
            }
        }
        list.sort(null);
        System.out.println(list.size());
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public static void bfs(POINT k) {
        Queue<POINT> q = new LinkedList<>();
        int cont = 0;
        int x[] = {1, 0, -1, 0};
        int y[] = {0, -1, 0, 1};
        if (isvisited[k.x][k.y] == false) {
            q.offer(k);
            isvisited[k.x][k.y] = true;
            while (!q.isEmpty()) {
                POINT p = q.poll();
                cont++;
                for (int i = 0; i < x.length; i++) {
                    int p_x = x[i] + p.x;
                    int p_y = y[i] + p.y;
                    if (p_x >= 0 && p_x < N && p_y >= 0 && p_y < N && !isvisited[p_x][p_y] && map[p_x][p_y] == 1) {
                        isvisited[p_x][p_y] = true;
                        q.offer(new POINT(p_x, p_y));
                    }

                }


            }
            list.add(cont);
        }


    }

    public static void print() {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(isvisited[i][j] + " ");
            }
            System.out.println();
        }
    }
}

class POINT {

    int x, y;

    public POINT(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
