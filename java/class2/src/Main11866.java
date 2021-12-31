import java.io.*;
import java.util.*;

public class Main11866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> queue = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        sb.append("<");

        for(int i=1;i<=n;i++){
            queue.add(i);
        }

        while(!queue.isEmpty()){
            for(int i=0;i<k-1;i++){
                int tmp = queue.poll();
                queue.offer(tmp);
            }
            sb.append(queue.poll());
            if(!queue.isEmpty())
                sb.append(", ");

        }
        sb.append(">");
        System.out.println(sb);
    }
}
