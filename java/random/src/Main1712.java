import java.util.*;
import java.io.*;

public class Main1712 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int income = c-b;
        int cnt = 0;

        if(income <= 0) {
            System.out.println(-1);
            return;
        }

        System.out.println(a/income+1);
    }
}
