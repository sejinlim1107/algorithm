import java.util.*;
import java.io.*;

public class Main1463 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] ans = new int[n+1];
        ans[1] = 0;

        for(int i=2;i<n+1;i++){
            int a1=n;
            int a2=n;

            ans[i] = ans[i-1]+1;
            if(i%2==0){
                a1 = i/2-1;
            }
            if(i%3==0){
                a2 = i/3-1;
            }
            ans[i] = Math.min(Math.min(a1,a2),ans[i]);
            System.out.println(i+": "+ans[i]);
        }

        System.out.println(ans[n]);
    }
}
