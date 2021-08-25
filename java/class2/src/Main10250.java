import java.util.*;
import java.io.*;

public class Main10250 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuffer sb = new StringBuffer();
        int y, x;

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int H = Integer.parseInt(st.nextToken());
            int W = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());

            x = (int)(N / H)+1;
            y = N % H;
            if(y == 0) {
                y = H;
                x--;
            }
            sb.append(y*100 + x + "\n");
        }
        System.out.println(sb);
    }
}
