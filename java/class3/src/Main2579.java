import java.util.*;
import java.io.*;

public class Main2579 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int[] scores = new int[num+1];
        int[] dp = new int[num+1];

        for(int i=1;i<num+1;i++){
            scores[i] = Integer.parseInt(br.readLine());
        }

        dp[1] = scores[1];
        dp[2] = scores[2];

        for(int i=3;i<num+1;i++){
            dp[i] = Math.min(dp[i-2]+scores[i],dp[i-1]);
            System.out.println(i+" "+dp[i]);
        }
        System.out.println(dp[num]);
    }
}