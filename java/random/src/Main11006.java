import java.io.*;
import java.util.*;

public class Main11006 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int t = Integer.parseInt(br.readLine());
        while(t-->0){
            st = new StringTokenizer(br.readLine());
            int dari = Integer.parseInt(st.nextToken());
            int dark = Integer.parseInt(st.nextToken());
            int nodari = dark*2 - dari;
            sb.append(nodari).append(" ").append(dark-nodari).append("\n");
        }
        System.out.println(sb);
    }
}
