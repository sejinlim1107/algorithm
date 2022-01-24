import java.util.*;
import java.io.*;

public class Main11279 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int n = Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++){
            int tmp = Integer.parseInt(br.readLine());
            if(tmp>0)
                pq.add(tmp);
            else {
                if (pq.isEmpty()) {
                    sb.append(0).append("\n");
                } else {
                    sb.append(pq.poll()).append("\n");
                }
            }
        }
        System.out.println(sb);
    }
}