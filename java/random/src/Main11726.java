import java.util.*;
import java.io.*;

public class Main11726 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] ans = new int[n+1];
        ans[1] = 1;
        if(n==1){
            System.out.println(ans[n]);
            return;
        }
        ans[2] = 2;

        for(int i=3;i<n+1;i++){
            ans[i] = (ans[i-1]+ans[i-2])%10007;
        }

        System.out.println(ans[n]);
    }
}
