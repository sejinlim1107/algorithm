import java.util.*;
import java.io.*;

public class Main11047 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] coin = new int[n];
        int ans = 0;


        for(int i=0;i<n;i++){
            coin[n-1-i] = Integer.parseInt(br.readLine()); //내림차순
        }

        int i=0;
        int tmp = k;
        while(k!=0){
            if(coin[i] > k){
                i++;
                continue;
            }
            ans += tmp / coin[i];
            k = k % coin[i];
            tmp = k;
        }

        System.out.println(ans);
    }
}
