import java.util.*;
import java.io.*;

public class Main2667 {
    public static int[][] danji;
    public static int[] dx = {-1,1,0,0};
    public static int[] dy = {0,0,-1,1};
    public static int n;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        ArrayList<Integer> num = new ArrayList<>();
        n = Integer.parseInt(br.readLine());
        danji = new int[n][n];
        int cnt = 0; // 단지 수
        for(int i=0;i<n;i++){
            String s = br.readLine();
            for(int j=0;j<n;j++){
                danji[i][j] = s.charAt(j)-'0';
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(danji[i][j]==1){
                    int tmp = bfs(i,j);
                    num.add(tmp);
                    cnt++;
                }
            }
        }
        Collections.sort(num);
        sb.append(cnt).append("\n");
        for(int i=0;i<num.size();i++){
            sb.append(num.get(i)).append("\n");
        }
        System.out.println(sb);
    }

    public static int bfs(int x, int y){
        int cnt = 0; //단지 내 집 수
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[] {x,y});
        danji[x][y] = -1; //방문했음을 표시
        cnt++;

        while(!queue.isEmpty()){
            int[] tmp = queue.poll();
            int a = tmp[0];
            int b = tmp[1];
            for(int i=0;i<4;i++){
                int newx = a+dx[i];
                int newy = b+dy[i];
                if(newx<0||newx>=n||newy<0||newy>=n)
                    continue;
                if(danji[newx][newy] == 1){ //아직 방문 안했으면
                    cnt++;
                    queue.add(new int[] {newx,newy});
                    danji[newx][newy] = -1; //방문했음을 표시
                }
            }
        }
        return cnt;
    }
}