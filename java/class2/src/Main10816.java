import java.util.*;
import java.io.*;

public class Main10816 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int[] num = new int[20000001];

        int len = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        while(len-->0){
            num[Integer.parseInt(st.nextToken())+10000000]++;
        }

        len = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        while(len-->0){
            sb.append(num[Integer.parseInt(st.nextToken())+10000000]).append(" ");
        }
        System.out.println(sb);
    }
    /*
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        for(int i=0;i<n;i++){
            int a = Integer.parseInt(st.nextToken());
            map.put(a, map.getOrDefault(a, 0)+1);
        }

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        for(int i=0;i<m;i++){
            int a = Integer.parseInt(st.nextToken());
            sb.append(map.getOrDefault(a, 0)).append(" ");
        }

        System.out.println(sb);
    }
     */
}
