import java.io.*;
import java.util.*;

public class Main2630 {
    public static int[][] paper;
    public static int w = 0;
    public static int b = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        paper = new int[n][n];
        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<n;j++){
                paper[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        dc(0,0,n);
        System.out.println(w);
        System.out.println(b);
    }
    public static void dc(int r, int c, int size){
        int color = paper[r][c];
        for(int i=r;i<r+size;i++){
            for(int j=c;j<c+size;j++){
                if(paper[i][j]!=color){
                    size /= 2;
                    dc(r,c, size);
                    dc(r,c+size, size);
                    dc(r+size,c, size);
                    dc(r+size,c+size, size);
                    return;
                }
            }
        }
        if(color==1) // blue
            b++;
        else // white
            w++;
    }
}
