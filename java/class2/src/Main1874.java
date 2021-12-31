import java.util.*;
import java.io.*;

public class Main1874 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int lastNum = 0; //현재까지 스택에 넣은 수

        for(int i=0;i<n;i++){
            int tmp = Integer.parseInt(br.readLine());
            if(lastNum < tmp) {
                for(int j=lastNum+1;j<=tmp;j++) {
                    stack.push(j);
                    sb.append("+").append("\n");
                }
                lastNum = tmp;
            }
            if(stack.peek() == tmp){
                sb.append("-").append("\n");
                stack.pop();
            }
            else if(lastNum > tmp) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println(sb);
    }
}