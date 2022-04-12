import java.util.*;
import java.io.*;

public class Main9094 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        for(int i=0;i<t;i++){
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int sum = 0;
            for(int a=1;a<n;a++){
                for(int b=a+1;b<n;b++){
                    int tmp = a*a+b*b+m;
                    if(tmp%(a*b)==0)
                        sum++;
                }
            }
            sb.append(sum).append("\n");
        }
        System.out.println(sb);
    }
}