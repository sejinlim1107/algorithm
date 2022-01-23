import java.util.*;
import java.io.*;

public class Main1927 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<n;i++){
            int tmp = Integer.parseInt(br.readLine());
            if(tmp>0)
                pq.add(tmp);
            else {
                if(pq.isEmpty())
                    sb.append(0).append("\n");
                else
                    sb.append(pq.poll()).append("\n");
            }
        }
        System.out.println(sb);
    }
}
