import java.util.*;
import java.io.*;

public class Main2476 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        int max = 0;
        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            int tmp = 0;
            if(a==b && a==c){
                tmp+=10000+a*1000;
            }
            else if(a==b || a==c){
                tmp+=1000+100*a;
            }
            else if(b==c){
                tmp+=1000+100*b;
            }
            else{
                tmp = Math.max(a,b);
                tmp = Math.max(tmp,c);
                tmp*=100;
            }
            if(max < tmp)
                max = tmp;
        }
        System.out.println(max);
    }
}