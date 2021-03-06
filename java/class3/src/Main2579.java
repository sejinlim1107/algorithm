import java.util.*;
import java.io.*;

public class Main2579 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int[] scores = new int[num+2];
        int[] dp = new int[num+2];

        for(int i=1;i<num+1;i++){
            scores[i] = Integer.parseInt(br.readLine());
        }
        dp[1] = scores[1];
        dp[2] = scores[1]+scores[2];

        for(int i=3;i<num+1;i++)
            dp[i] = Math.max(dp[i-2],dp[i-3]+scores[i-1])+scores[i];
        System.out.println(dp[num]);
    }
}