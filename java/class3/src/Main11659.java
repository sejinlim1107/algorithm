import java.util.*;
import java.io.*;

public class Main11659 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] num = new int[n+1];
        int[] sum = new int[n+1];

        st = new StringTokenizer(br.readLine());
        for(int i=1;i<=n;i++){
            num[i] = Integer.parseInt(st.nextToken());
            sum[i] = num[i]+sum[i-1];
        }
        for(int i=0;i<m;i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            sb.append(sum[b]-sum[a-1]).append("\n");
        }
        System.out.println(sb);
    }
}