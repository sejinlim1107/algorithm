import java.io.*;
import java.util.*;

public class Main10866 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        Deque<Integer> deque = new LinkedList<>();

        int n = Integer.parseInt(br.readLine());

        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            String s = st.nextToken();

            if(s.equals("push_back")){
                int a = Integer.parseInt(st.nextToken());
                deque.addLast(a);
            }
            else if(s.equals("push_front")){
                int a = Integer.parseInt(st.nextToken());
                deque.addFirst(a);
            }
            else if(s.equals("pop_back")){
                if(deque.isEmpty()){
                    sb.append(-1).append("\n");
                }
                else sb.append(deque.pollLast()).append("\n");
            }
            else if(s.equals("pop_front")){
                if(deque.isEmpty()){
                    sb.append(-1).append("\n");
                }
                else sb.append(deque.pollFirst()).append("\n");
            }
            else if(s.equals("size")){
                sb.append(deque.size()).append("\n");
            }
            else if(s.equals("empty")){
                if(deque.isEmpty()){
                    sb.append(1).append("\n");
                }
                else sb.append(0).append("\n");
            }
            else if(s.equals("back")){
                if(deque.isEmpty()){
                    sb.append(-1).append("\n");
                }
                else sb.append(deque.peekLast()).append("\n");
            }
            else if(s.equals("front")){
                if(deque.isEmpty()){
                    sb.append(-1).append("\n");
                }
                else sb.append(deque.peekFirst()).append("\n");
            }
        }
        System.out.println(sb);
    }
}
