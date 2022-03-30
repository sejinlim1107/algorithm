import java.util.*;
import java.io.*;

public class Main5063 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        for(int i=0;i<t;i++){
            st = new StringTokenizer(br.readLine());
            int r = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            if(e-r < c)
                sb.append("do not advertise").append("\n");
            else if(e-r == c)
                sb.append("does not matter").append("\n");
            else
                sb.append("advertise").append("\n");
        }
        System.out.println(sb);
    }
}
