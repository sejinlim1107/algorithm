import java.util.*;
import java.io.*;

public class Main1620 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        HashMap<String, Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        String[] arr = new String[n+1];

        for(int i=1;i<=n;i++){
            String s = br.readLine();
            map.put(s, i);
            arr[i] = s;
        }

        for(int i=0;i<m;i++){
            String s = br.readLine();
            if(s.charAt(0)<='9' && s.charAt(0) >= '1'){ // 숫자면
                int idx = Integer.parseInt(s);
                sb.append(arr[idx]).append("\n");
            }
            else { // String이면
                sb.append(map.get(s)).append("\n");
            }
        }
        System.out.println(sb);
    }
}