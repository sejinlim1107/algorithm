import java.util.*;
import java.io.*;

public class Main2775 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        int human[][] = new int[15][15];

        for(int i=1;i<15;i++) //0층 셋팅
            human[0][i] = i;

        for(int i=1;i<15;i++){
            for(int j=1;j<15;j++){
                human[i][j] = human[i][j-1]+human[i-1][j];
            }
        }

        for(int i=0;i<T;i++) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());

            sb.append(human[k][n]).append("\n");
        }
        System.out.println(sb);
    }
}
