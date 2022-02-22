import java.util.*;
import java.io.*;

public class Main11286 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        PriorityQueue<Integer> pq = new PriorityQueue<>((o1, o2) ->
                Math.abs(o1) == Math.abs(o2) ? Integer.compare(o1, o2) : Integer.compare(Math.abs(o1), Math.abs(o2)));

        int n = Integer.parseInt(br.readLine());

        for(int i=0;i<n;i++){
            int tmp = Integer.parseInt(br.readLine());
            if(tmp==0){
                if(pq.isEmpty())
                    sb.append(0).append("\n");
                else{
                    int value = pq.poll();
                    sb.append(value).append("\n");
                }
            }
            else{
                pq.add(tmp);
            }
        }
        System.out.println(sb);
    }
}