import java.io.*;
import java.util.*;

public class Main22966 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        String answer = "";
        int min = 5;
        int n = Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            int num = Integer.parseInt(st.nextToken());
            if(min>num) {
                min = num;
                answer = s;
            }
        }
        System.out.println(answer);
    }

    /*
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        TreeMap<Integer, String> map = new TreeMap<>();
        int n = Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            int num = Integer.parseInt(st.nextToken());
            map.put(num, s);
        }
        System.out.println(map.get(map.firstKey()));
    }
     */
}