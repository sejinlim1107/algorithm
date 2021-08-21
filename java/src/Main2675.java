import java.util.*;
import java.io.*;

public class Main2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuffer sb = new StringBuffer();

        int T = Integer.parseInt(br.readLine());
        for(int i=0;i<T;i++){
            st = new StringTokenizer(br.readLine());
            int R = Integer.parseInt(st.nextToken());
            String s = st.nextToken().toString();

            for(int j=0;j<s.length();j++){
                for(int k=0;k<R;k++)
                    sb.append(s.charAt(j));
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
