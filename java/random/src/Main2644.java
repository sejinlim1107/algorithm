import java.util.*;
import java.io.*;

public class Main2644 {
    public static boolean[] visited;
    public static ArrayList<ArrayList<Integer>> family = new ArrayList<ArrayList<Integer>>();
    public static int res = -1;
    public static int cnt = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(br.readLine());
        visited = new boolean[n+1];

        for(int i=0;i<=n;i++){
            family.add(new ArrayList<>());
        }

        for(int i=0;i<m;i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            family.get(x).add(y);
            family.get(y).add(x);
        }

        dfs(a, b);
        System.out.println(res);
    }

    public static void dfs(int v1, int v2){
        if(v1 == v2){
            res = cnt;
            return;
        }
        visited[v1] = true;
        cnt++;
        for(int i=0;i<family.get(v1).size();i++){
            int index = family.get(v1).get(i);
            if(!visited[index]){
                dfs(index, v2);
                cnt--;
            }
        }
    }
}