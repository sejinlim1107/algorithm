import java.io.*;
import java.util.*;

public class Main18870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int[] origin = new int[n];
        int[] sorted = new int[n];
        int rank = -1;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            origin[i] = Integer.parseInt(st.nextToken());
            sorted[i] = origin[i];
        }
        Arrays.sort(sorted);
        for(int i=0;i<n;i++){
            if(!map.containsKey(sorted[i])) {
                rank++;
                map.put(sorted[i], rank);
            }
        }
        for(int i=0;i<n;i++){
            sb.append(map.get(origin[i]));
            sb.append(" ");
        }
        System.out.println(sb);
    }
}