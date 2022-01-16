import java.util.*;
import java.io.*;

public class Main2579 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int[] scores = new int[num+1];
        int[] dp = new int[num+1];
        dp[1] = scores[1];
        dp[2] = scores[2];
        for(int i=0;i<num+1;i++){
            scores[i] = Integer.parseInt(br.readLine());
        }

        for(int i=3;i<num+1;i++){ // 범위 주의
            dp[i] = Math.min(dp[i-1]+scores[i+1],dp[i-1]+scores[i]);
        }
    }
}
