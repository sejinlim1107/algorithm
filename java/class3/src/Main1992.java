import java.util.*;
import java.io.*;

public class Main1992 {
    public static int[][] video;
    public static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        video = new int[n][n];
        for(int i=0;i<n;i++){
            String s = br.readLine();
            for(int j=0;j<n;j++){
                video[i][j] = s.charAt(j)-'0';
            }
        }
        dc(0,0,n);
        System.out.println(sb);
    }

    public static void dc(int r, int c, int size){
        int target = video[r][c];
        for(int i=r;i<r+size;i++){
            for(int j=c;j<c+size;j++){
                if(video[i][j]!=target){
                    size/=2;
                    sb.append("(");
                    dc(r,c,size); // 왼위
                    dc(r,c+size,size); // 오위
                    dc(r+size,c,size); // 왼아래
                    dc(r+size,c+size,size); // 오아래
                    sb.append(")");
                    return;
                }
            }
        }
        sb.append(target);
    }
}
