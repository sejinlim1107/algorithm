import java.util.*;
import java.io.*;

public class Main2667 {
    public static boolean[][] visited;
    public static int[][] map;
    public static int[] dx = {-1, 1, 0, 0};
    public static int[] dy = {0, 0, -1, 1};
    public static int n;
    public static int num = 0;
    public static ArrayList<Integer> answer;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        for(int i=0;i<n;i++){
            String s = br.readLine();
            for(int j=0;j<n;j++){
                if(s.charAt(i)=='1'){
                    map[i][j] = 1;
                }
            }
        }
    }
}
