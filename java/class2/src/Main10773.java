import java.util.*;
import java.io.*;

public class Main10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();
        long answer = 0;

        int k = Integer.parseInt(br.readLine());
        for(int i=0;i<k;i++){
            int a = Integer.parseInt(br.readLine());
            if(a==0)
                stack.pop();
            else{
                stack.push(a);
            }
        }

        while(stack.size()!=0){
            answer += stack.pop();
        }

        System.out.println(answer);
    }
}
