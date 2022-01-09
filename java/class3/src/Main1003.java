import java.util.*;
import java.io.*;

public class Main1003 {
    public static Integer[][] dp = new Integer[41][2];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        dp[0][0] = 1;
        dp[0][1] = 0;
        dp[1][0] = 0;
        dp[1][1] = 1;

        for(int i=0;i<t;i++){
            int k = Integer.parseInt(br.readLine());
            fibo(k);
            sb.append(dp[k][0]+" "+dp[k][1]).append("\n");
        }
        System.out.println(sb);
    }
    public static Integer[] fibo(int k){
        if(dp[k][0] == null || dp[k][1] == null){
            dp[k][0] = fibo(k-1)[0] + fibo(k-2)[0];
            dp[k][1] = fibo(k-1)[1] + fibo(k-2)[1];
        }
        return dp[k];
    }
}