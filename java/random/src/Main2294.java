import java.util.*;
import java.io.*;

public class Main2294 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] d = new int[k+1];
        int[] coin = new int[n];
        d[0] = 0;

        for(int i=0;i<n;i++){
            coin[i] = Integer.parseInt(br.readLine());
        }

        for(int i=1;i<k+1;i++){
            d[i] = 10001;
        }

        for(int i=0;i<n;i++){
            for(int j=coin[i];j<k+1;j++) {
                d[j] = Math.min(d[j], d[j-coin[i]]+1);
            }
        }
        if(d[k]==10001)
            System.out.println(-1);
        else System.out.println(d[k]);
    }
}
