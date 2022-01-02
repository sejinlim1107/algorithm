import java.io.*;
import java.util.*;

public class Main2178 {
    public static int[][] miro;
    public static boolean[][] visited;
    public static int[] dx = {-1, 1, 0, 0};
    public static int[] dy = {0, 0, -1, 1};
    public static int n;
    public static int m;

    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        miro = new int[n+1][m+1];
        visited = new boolean[n+1][m+1];
        visited[1][1] = true;

        for(int i=0;i<n;i++){
            String s = br.readLine();
            for(int j=0;j<m;j++) {
                if (s.charAt(j) == '1') {
                    miro[i+1][j+1] = 1;
                }
            }
        }

        bfs(1,1);
        System.out.println(miro[n][m]);
    }

    public static void bfs(int n1, int n2){
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[] {n1,n2});

        while(!queue.isEmpty()){
            int[] tmp = queue.poll();
            int prex = tmp[0];
            int prey = tmp[1];

            for(int i=0;i<4;i++){
                int newx = prex + dx[i];
                int newy = prey + dy[i];

                if(newx<1 || newy<1 || newx>=n+1 || newy>=m+1)
                    continue;
                if(miro[newx][newy] == 1 && !visited[newx][newy]){
                    queue.add(new int[] {newx, newy});
                    miro[newx][newy] = miro[prex][prey]+1;
                    visited[newx][newy] = true;
                }
            }
        }
    }
}
