import java.util.*;
import java.io.*;

public class Main9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        Character c;

        int n = Integer.parseInt(br.readLine());

        for(int i=0;i<n;i++){
            String s = br.readLine();
            for(int j=0;j<s.length();j++){
                if((c = s.charAt(j))=='(')
                    stack.push(c);
                else if(!stack.empty() && c == ')'){
                    stack.pop();
                }
                else if(stack.empty() && c == ')'){
                    sb.append("NO").append("\n");
                    break;
                }
                if(j==s.length()-1 && !stack.empty())
                    sb.append("NO").append("\n");
                else if(j==s.length()-1 && stack.empty())
                    sb.append("YES").append("\n");
            }
            stack.clear();
        }
        System.out.println(sb);
    }
}
