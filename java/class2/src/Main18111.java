import java.util.*;
import java.io.*;

public class Main18111 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); // 세로
        int m = Integer.parseInt(st.nextToken()); // 가로
        int b = Integer.parseInt(st.nextToken()); // 인벤토리에 들어있는 블록 수
        int[][] world = new int[n][m];
        int minTime = Integer.MAX_VALUE;
        int maxHeight = 0;

        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<m;j++){
                world[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int height = 0;
        int cnt = 257;

        while(cnt-->0) {
            int one = 0; // 1번 방법
            int two = 0; // 2번 방법
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    int tmp = world[i][j] - height;
                    if (tmp > 0) // 높이를 줄여야하는 경우 (즉 1번 방법을 써야하는 경우)
                        one += tmp;
                    else if (tmp < 0)
                        two += (-tmp);
                }
            }
            int time = one*2 + two*1;

            if(time >= 0 && (b+one-two) >= 0){ // 인벤터리에 블록이 부족하지 않는 경우
                if(minTime >= time) {
                    minTime = time;
                    if(maxHeight < height)
                        maxHeight = height;
                }
            }
            height++;
        }
        System.out.println(minTime+" "+maxHeight);
    }
}
