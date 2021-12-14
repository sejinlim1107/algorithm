import java.util.*;
import java.io.*;

public class Main10845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        Queue<Integer> queue = new LinkedList<>();
        int n = Integer.parseInt(br.readLine());
        int back=0;

        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            if(s.equals("push")){
                back = Integer.parseInt(st.nextToken());
                queue.add(back);
            }
            else if(s.equals("front")){
                if(queue.isEmpty())
                    sb.append(-1).append("\n");
                else
                    sb.append(queue.peek()).append("\n");
            }
            else if(s.equals("back")){
                if(queue.isEmpty())
                    sb.append(-1).append("\n");
                else
                    sb.append(back).append("\n");
            }
            else if(s.equals("pop")){
                if(queue.isEmpty())
                    sb.append(-1).append("\n");
                else
                    sb.append(queue.poll()).append("\n");
            }
            else if(s.equals("size")){
                sb.append(queue.size()).append("\n");
            }
            else if(s.equals("empty")){
                if(queue.isEmpty())
                    sb.append(1).append("\n");
                else
                    sb.append(0).append("\n");
            }
        }
        System.out.println(sb);
    }
}
