import java.util.*;
import java.io.*;

public class Main13301 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long [] ans = new long[n+1];
        ans[1] = 1;
        if(n==1){
            System.out.println(4);
            return;
        }
        ans[2] = 1;
        if(n==2){
            System.out.println(6);
            return;
        }

        for(int i=3;i<n+1;i++){
            ans[i] = ans[i-1]+ans[i-2];
        }

        System.out.println(ans[n]*3+ans[n-1]*2+ans[n-2]*2+ans[n-3]);
    }
}
