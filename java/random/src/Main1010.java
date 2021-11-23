import java.util.*;
import java.io.*;

public class Main1010 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int j=0;j<t;j++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            long ans = 1;

            if(n>m-n)
                n = m-n;

            for(int i=0;i<n;i++){
                ans *= m;
                m--;
            }

            int c = n;

            for(int i=0;i<n;i++){
                ans /= c;
                c--;
            }

            sb.append(ans).append("\n");
        }

        System.out.println(sb);
    }
}
