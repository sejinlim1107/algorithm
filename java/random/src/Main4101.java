import java.util.*;
import java.io.*;

public class Main4101 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        while(true){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if(a==0 && b==0)
                break;
            else if(a>b)
                sb.append("Yes").append("\n");
            else
                sb.append("No").append("\n");
        }
        System.out.println(sb);
    }
}
