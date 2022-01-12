import java.util.*;
import java.io.*;

public class Main17626 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] dp = new int[n+1]; // 개수 저장

        Arrays.fill(dp, 5);
        dp[0] = 0;
        dp[1] = 1;

        for(int i=2;i<n+1;i++){
            for(int j=1; (j*j)<=i;j++){
                int tmp = dp[i-j*j]+1; // 여기서 +1은 제곱수 하나를 의미
                dp[i] = Math.min(tmp,dp[i]); // dp[0]=0 이라서 i==j*j일 때 제곱수 계산이 (1로) 됨
            }
        }
        System.out.println(dp[n]);
    }
}