import java.io.*;
import java.util.*;
/*
public class Main1260 {
    public static int n,m,v;
    public static boolean[] visited;
    public static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();

    public static void dfs(int k) {
        // 현재 노드를 방문 처리
        visited[k] = true;
        // 현재 노드와 연결된 다른 노드를 재귀적으로 방문
        for (int i = 0; i < graph.get(k).size(); i++) {
            int y = graph.get(k).get(i);
            if (!visited[y]) dfs(y);
        }
    }

    public static void bfs(int k) {
        // 현재 노드를 방문 처리
        visited[k] = true;
        // 현재 노드와 연결된 다른 노드를 재귀적으로 방문
        for (int i = 0; i < graph.get(k).size(); i++) {
            int y = graph.get(k).get(i);
            if (!visited[y]) dfs(y);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        x = Integer.parseInt(br.readLine());
        y = Integer.parseInt(br.readLine());
        visited = new boolean[x];

        int answer = 0;

        for (int i = 0; i < x; i++) {
            graph.add(new ArrayList<Integer>());
        }

        for (int i = 0; i < y; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph.get(a-1).add(b-1);
            graph.get(b-1).add(a-1);
        }

        dfs(v-1);

        for(int i=0;i<x;i++){
            visited[i] = false;
        }


    }
}


 */