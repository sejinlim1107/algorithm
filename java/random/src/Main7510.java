import java.io.*;
import java.util.*;

public class Main7510 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if(a<b){
                int tmp = a;
                a = b;
                b = tmp;
            }
            int c = Integer.parseInt(st.nextToken());
            if(a<c){
                int tmp = a;
                a = c;
                c = tmp;
            }
            sb.append("Scenario #");
            sb.append(i+1).append(":\n");
            if(a*a == b*b+c*c)
                sb.append("yes\n\n");
            else
                sb.append("no\n\n");
        }
        System.out.println(sb);
    }
}