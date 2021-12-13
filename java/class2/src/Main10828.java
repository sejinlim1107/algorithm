import java.util.*;
import java.io.*;

public class Main10828 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();

        int n = Integer.parseInt(br.readLine());

        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            String a = st.nextToken();

            if(a.equals("push")){
                int b = Integer.parseInt(st.nextToken());
                stack.push(b);
            }
            else if(a.equals("top")){
                if(stack.isEmpty()){
                    sb.append(-1).append("\n");
                }
                else sb.append(stack.peek()).append("\n");
            }
            else if(a.equals("size")){
                sb.append(stack.size()).append("\n");
            }
            else if(a.equals("empty")){
                if(stack.isEmpty()){
                    sb.append(1).append("\n");
                }
                else sb.append(0).append("\n");
            }
            else if(a.equals("pop")){
                if(stack.isEmpty()){
                    sb.append(-1).append("\n");
                }
                else sb.append(stack.pop()).append("\n");
            }
        }

        System.out.println(sb);
    }
}
