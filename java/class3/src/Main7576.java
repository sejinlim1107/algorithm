import java.io.*;
import java.util.*;

public class Main7576 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        int[][] box = new int[n][m];
        int days = 0;
        boolean all = true;
        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<m;j++){
                int tmp = Integer.parseInt(st.nextToken());
                box[i][j] = tmp;
                if(tmp!=1)
                    all = false;
            }
        }
        if(all) {
            System.out.println(0);
            return;
        }
    }
}