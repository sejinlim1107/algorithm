import java.util.*;
import java.io.*;

public class Main9095 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int[] dp = new int[11];
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 3;

        for(int i=4;i<11;i++){
            dp[i] = dp[i-3]+dp[i-2]+dp[i-1]+1;
        }

        for(int i=0;i<n;i++){
            sb.append(dp[Integer.parseInt(br.readLine())]).append("\n");
        }
        System.out.println(sb);
    }
}
