import java.io.*;
import java.util.*;

public class Main2355 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        if(a>b){
            long tmp = a;
            a = b;
            b = tmp;
        }
        long sum = 0;
        if(a<0){
            if(b<0){
                a = -a;
                b = -b;
                sum = a*(a+1)/2 - b*(b+1)/2 + b;
                sum = -sum;
            }
            else{
                a = -a;
                long tmp = a*(a+1)/2;
                tmp = -tmp;
                sum = b*(b+1)/2;
                sum += tmp;
            }
        }
        else sum = b*(b+1)/2 - a*(a+1)/2 + a;
        System.out.println(sum);
    }
}