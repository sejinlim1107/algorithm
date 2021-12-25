import java.io.*;
import java.util.*;

public class Main1260 {
    public static int n,m,v;
    public static boolean[] visited;
    public static int[][] graph = new int[1001][1001];
    public static StringBuilder sb = new StringBuilder();

    public static void dfs(int k) {
        // 현재 노드를 방문 처리
        visited[k] = true;
        sb.append(k+" ");


        // 현재 노드와 연결된 다른 노드를 재귀적으로 방문
        for (int i = 1; i <= n; i++) {
            if(graph[k][i] == 1){
                if (!visited[i]) dfs(i);
            }
        }
    }

    public static void bfs(int k) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(k);
        visited[k] = true;

        while(queue.size() != 0){
            int index = queue.poll();
            sb.append(index+" ");
            for (int i = 1; i <= n; i++) {
                if(graph[index][i] == 1){
                    if (!visited[i]) {
                        queue.add(i);
                        visited[i] = true;
                    }
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        v = Integer.parseInt(st.nextToken());
        visited = new boolean[n+1];

        int answer = 0;

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph[a][b] = 1;
            graph[b][a] = 1;
        }

        dfs(v);

        for(int i=1;i<=n;i++){
            visited[i] = false;
        }

        sb.append("\n");

        bfs(v);

        System.out.println(sb);
    }
}


