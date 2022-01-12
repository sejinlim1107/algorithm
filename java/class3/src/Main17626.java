import java.util.*;
import java.io.*;

public class Main17626 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] dp = new int[n+1]; // 개수 저장

        Arrays.fill(dp, 5);
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 3;

        int k = 2;

        while(k<=n){
            int pow = (int)Math.pow(k,2);
            if(pow >= n+1)
                break;
            else {
                dp[pow] = 1;
                k++;
            }
        }

        for(int i=3;i<n+1;i++){
            for(int j=1;j<i;j++){
                int tmp = dp[i-j] + dp[j];
                dp[i] = Math.min(tmp, dp[i]);
            }
        }
        System.out.println(dp[n]);
    }
}
