import java.io.*;
import java.util.*;

public class Main10539 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int len = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = 1;
        int sum = 0;
        while(len-->0){
            int now = Integer.parseInt(st.nextToken());
            int pre = now*n-sum;
            sb.append(pre).append(" ");
            sum+=pre;
            n++;
        }
        System.out.println(sb);
    }
}