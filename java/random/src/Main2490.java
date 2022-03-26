import java.util.*;
import java.io.*;

public class Main2490 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        char[] yut = {'E', 'A', 'B', 'C', 'D'};
        for(int i=0;i<3;i++){
            int cnt=0;
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<4;j++) {
                if (Integer.parseInt(st.nextToken()) == 0)
                    cnt++;
            }
            sb.append(yut[cnt]);
            sb.append("\n");
        }
        System.out.println(sb);
    }
}