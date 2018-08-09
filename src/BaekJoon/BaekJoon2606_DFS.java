package BaekJoon;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by dowon on 2017. 9. 19..
 */
public class BaekJoon2606_DFS {

    static boolean[] check;
    static ArrayList<Integer>[] com;

    static void dfs(int node){
        if(check[node]) return;
        check[node] = true;

        for(int x : com[node]){
            if(!check[x]){
                dfs(x);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 컴퓨터 대수
        int pair = sc.nextInt(); // 쌍

        check = new boolean[n + 1];
        com =  new ArrayList[n + 1];

        for (int i = 1; i <= n; i++)
            com[i] = new ArrayList<>();

        for (int i = 1; i <= pair; i++) {
            int node = sc.nextInt();
            int sub = sc.nextInt();
            com[node].add(sub);
            com[sub].add(node);
            System.out.println(com.toString());
        }

        dfs(1);
        int count = 0;

        for(int i=2; i<=check.length-1; i++){
            if(check[i]) count++;
        }
        System.out.println(count);
    }
}
