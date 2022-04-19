import java.util.*;
import java.io.*;

public class Main4880 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        while(true){
            String s = br.readLine();
            if(s.equals("0 0 0"))
                break;
            st = new StringTokenizer(s);
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            if(b-a == c-b && b-a!=0){
                sb.append("AP ").append(c+b-a).append("\n");
            }
            else{
                int r = 1;
                if(a!=0)
                    r = b/a;
                else if(b!=0)
                    r = c/b;
                sb.append("GP ").append(c*r).append("\n");
            }
        }
        System.out.println(sb);
    }
}