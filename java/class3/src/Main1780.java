import java.util.*;
import java.io.*;

public class Main1780 {
    public static int[][] paper;
    public static int one=0;
    public static int two=0;
    public static int three=0;
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
        System.out.println(one);
        System.out.println(two);
        System.out.println(three);
    }
    public static void dc(int r, int c, int size){
        int target = paper[r][c];
        for(int i=r;i<r+size;i++){
            for(int j=c;j<c+size;j++){
                if(paper[i][j] != target){
                    size /= 3;
                    dc(r,c,size);
                    dc(r,c+size,size);
                    dc(r,c+size+size,size);
                    dc(r+size,c,size);
                    dc(r+size,c+size,size);
                    dc(r+size,c+size+size,size);
                    dc(r+size+size,c,size);
                    dc(r+size+size,c+size,size);
                    dc(r+size+size,c+size+size,size);
                    return;
                }
            }
        }
        if(target==-1)
            one++;
        else if(target==0)
            two++;
        else
            three++;
    }
}
