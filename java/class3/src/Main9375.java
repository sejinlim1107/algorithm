import java.util.*;
import java.io.*;

public class Main9375 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<t;i++) {
            int mul = 1;
            HashMap<String, Integer> map = new HashMap<>();
            int n = Integer.parseInt(br.readLine());
            for(int j=0;j<n;j++){
                st = new StringTokenizer(br.readLine());
                String s1 = st.nextToken();
                String s2 = st.nextToken();
                map.put(s2, map.getOrDefault(s2,0)+1);
            }
            for(String s : map.keySet()){
                mul *= map.get(s)+1;
            }
            sb.append(mul-1).append("\n");
        }
        System.out.println(sb);
    }
}