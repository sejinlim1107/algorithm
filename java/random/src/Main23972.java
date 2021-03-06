import java.io.*;
import java.util.*;

public class Main23972 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int k = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        if(n==1){
            System.out.println(-1);
            return;
        }
        long answer = (long)n*k/(n-1);
        if((n*k)%(n-1)!=0)
            answer++;
        System.out.println(answer);
    }
}