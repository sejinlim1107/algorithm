import java.io.*;
import java.util.*;

public class Main11022 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());

        for(int i=0;i<T;i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            sb.append("Case #"+(i+1)+": ").append(a+" + "+b+" = ").append(a+b).append("\n");
        }

        System.out.println(sb);
    }
}
