import java.io.*;
import java.util.*;

public class Main5704 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] alpha = new int[26];
        while(true){
            String s = br.readLine();
            if(s.equals("*"))
                break;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)!=' ')
                alpha[s.charAt(i)-'a']++;
            }
            boolean flag = true;
            for(int i=0;i<26;i++){
                if(alpha[i]==0){
                    flag = false;
                    sb.append("N").append("\n");
                    break;
                }
            }
            if(flag)
                sb.append("Y").append("\n");
            Arrays.fill(alpha,0);
        }
        System.out.println(sb);
    }
}