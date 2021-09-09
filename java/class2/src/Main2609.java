import java.io.*;
import java.util.*;

public class Main2609 {
    static int gcd(int a, int b){
        int tmp;
        if(a<b){
            tmp = a;
            a = b;
            b = tmp;
        }

        while(b!=0){
            tmp = a;
            a = b;
            b = tmp%b;
        }
        return a;
    }

    static int lcm(int a, int b, int g){
        return a*b/g;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int g = gcd(a,b);

        System.out.println(g);
        System.out.println(lcm(a,b,g));
    }
}
