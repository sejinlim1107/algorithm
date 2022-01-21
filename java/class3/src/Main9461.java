import java.util.*;
import java.io.*;

public class Main9461 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        long[] tri = new long[101];
        tri[1] = 1;
        tri[2] = 1;

        for(int i=3;i<101;i++){
            tri[i] = tri[i-2]+tri[i-3];
        }

        for(int i=0;i<t;i++){
            int n = Integer.parseInt(br.readLine());
            sb.append(tri[n]).append("\n");
        }
        System.out.println(sb);
    }
}
