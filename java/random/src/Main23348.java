import java.io.*;
import java.util.*;

public class Main23348 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] level = new int[3];
        for(int i=0;i<3;i++)
            level[i] = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(br.readLine());
        int max = 0;
        for(int i=0;i<n;i++){
            int sum = 0;
            for(int j=0;j<3;j++){
                st = new StringTokenizer(br.readLine());
                for(int k=0;k<3;k++){
                    sum+=Integer.parseInt(st.nextToken())*level[k];
                }
            }
            if(max < sum)
                max = sum;
        }
        System.out.println(max);
    }
}