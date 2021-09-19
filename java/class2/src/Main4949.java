import java.util.*;
import java.io.*;

public class Main4949 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String s;
        Stack<Character> stack = new Stack<>();
        while(true){
            if((s = br.readLine()).equals("."))
                break;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='(' || s.charAt(i)=='[')
                    stack.push(s.charAt(i));
                else if(s.charAt(i)==')'){
                    if(stack.empty()) {
                        sb.append("no").append("\n");
                        break;
                    }
                    else if(stack.pop() != '('){
                        sb.append("no").append("\n");
                        break;
                    }
                }
                else if(s.charAt(i)==']'){
                    if(stack.empty()) {
                        sb.append("no").append("\n");
                        break;
                    }
                    else if(stack.pop() != '['){
                        sb.append("no").append("\n");
                        break;
                    }
                }
                if(i == s.length()-1 && stack.empty())
                    sb.append("yes").append("\n");
                else if(i == s.length()-1 && !stack.empty())
                    sb.append("no").append("\n");
            }
            stack.clear();
        }
        System.out.println(sb);
    }
}
