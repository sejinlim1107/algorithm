import java.util.*;
import java.io.*;

public class Main1012 {
    public static int[] dx = {-1,1,0,0};
    public static int[] dy = {0,0,-1,1};
    public static int m;
    public static int n;
    public static int[][] field;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<t;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int cnt = 0;
            m = Integer.parseInt(st.nextToken()); // j
            n = Integer.parseInt(st.nextToken()); // i
            field = new int[n][m];
            int k = Integer.parseInt(st.nextToken());
            for(int j=0;j<k;j++){ // 배추 표시
                st = new StringTokenizer(br.readLine());
                int y = Integer.parseInt(st.nextToken());
                int x = Integer.parseInt(st.nextToken());
                field[x][y] = 1;
            }
            for(int a=0;a<n;a++){
                for(int b=0;b<m;b++){
                    if(field[a][b] == 1){
                        bfs(a,b);
                        cnt++;
                    }
                }
            }
            sb.append(cnt).append("\n");
        }
        System.out.println(sb);
    }

    public static void bfs(int x, int y){ // [][] 기준
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[] {x,y});

        while(!queue.isEmpty()) {
            int[] tmp = queue.poll();
            int n1 = tmp[0];
            int n2 = tmp[1];
            for (int i = 0; i < 4; i++) {
                int newx = n1 + dx[i];
                int newy = n2 + dy[i];
                if (newx < 0 || newx >= n || newy < 0 || newy >= m)
                    continue;
                if (field[newx][newy]==1) {
                    queue.add(new int[]{newx, newy});
                    field[newx][newy] = -1; // 큐에 넣고 방문했다고 표시. 그래야 타고 갔다가 다시 돌아올 때 내가 방문했던 곳인지 알 수 있음
                }
            }
        }
    }
}