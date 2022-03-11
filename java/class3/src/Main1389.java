import java.util.*;
import java.io.*;

public class Main1389 {
    public static int map[][];
    public static int n;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int min = Integer.MAX_VALUE;
        int answer = 0;
        n = Integer.parseInt(st.nextToken());
        map = new int[n+1][n+1];
        int m = Integer.parseInt(st.nextToken());
        for(int i=1;i<n+1;i++){
            for(int j=1;j<n+1;j++){
                if(i==j)
                    map[i][j]=0;
                else
                    map[i][j]= 600000;
            }
        }
        for(int i=0;i<m;i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            map[a][b] = 1;
            map[b][a] = 1;
        }
        for(int i=1;i<n+1;i++){
            for(int j=1;j<n+1;j++){
                for(int k=1;k<n+1;k++){
                    map[j][k] = Math.min(map[j][k],map[j][i]+map[i][k]);
                }
            }
        }
        for(int i=1;i<n+1;i++){
            int tmp =0;
            for(int j=1;j<n+1;j++)
                tmp+=map[i][j];
            if(min>tmp){
                min = tmp;
                answer = i;
            }
        }
        System.out.println(answer);
    }
}