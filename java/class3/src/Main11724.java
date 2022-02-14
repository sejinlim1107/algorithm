import java.util.*;
import java.io.*;

public class Main11724 {
    public static int n;
    public static ArrayList<ArrayList<Integer>> list;
    public static boolean[] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int cnt = 0;
        list = new ArrayList<ArrayList<Integer>>();
        visited = new boolean[n+1];
        for(int i=0;i<=n;i++){
            list.add(new ArrayList<>());
        }
        for(int i=0;i<m;i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            list.get(a).add(b);
            list.get(b).add(a);
        }
        bfs(1);
        cnt++;
        for(int i=2;i<=n;i++){
            if(!visited[i]) {
                bfs(i);
                cnt++;
            }
        }
        System.out.println(cnt);
    }
    public static void bfs(int n){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(n);
        while(!queue.isEmpty()){
            int tmp = queue.poll();
            System.out.println(tmp);
            for(int i=1;i<=list.get(tmp).size();i++){
                if(!visited[i]) {
                    queue.add(i);
                    visited[i] = true;
                }
            }
        }
    }
}