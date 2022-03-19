import java.io.*;
import java.util.*;

public class Main1934 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        for(int i=0;i<t;i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            sb.append(lcm(a,b));
            sb.append("\n");
        }
        System.out.println(sb);
    }
    public static int gcd(int a, int b){
        if(b == 0)
            return a;
        return gcd(b, a%b);
    }
    public static int lcm(int a, int b){
        return a*b/gcd(a,b);
    }
}
