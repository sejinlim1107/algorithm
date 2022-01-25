import java.util.*;
import java.io.*;

public class Main11286 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        PriorityQueue<Integer> pq1 = new PriorityQueue<>(); // 원본
        PriorityQueue<Integer> pq2 = new PriorityQueue<>(); // 절댓값
        int n = Integer.parseInt(br.readLine());

        for(int i=0;i<n;i++){
            int tmp = Integer.parseInt(br.readLine());
            if(tmp==0){
                if(pq1.isEmpty())
                    sb.append(0).append("\n");
                else{
                    Integer value = pq2.poll(); // 절댓값이 가장 작은 값
                    if(value.equals(pq1.peek()))
                        pq1.poll();
                    else {
                        value = -value;
                        pq1.remove(value);
                    }
                    sb.append(value).append("\n");
                }
            }
            else{
                pq1.add(tmp);
                pq2.add(Math.abs(tmp));
            }
        }
        System.out.println(sb);
    }
}