import java.util.*;
import java.io.*;

public class Main2386 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while(true){
            String s = br.readLine();
            if(s.equals("#"))
                break;
            int cnt = 0;
            char target = s.charAt(0);
            if(target<=90) { // 대문자
                for(int i=2;i<s.length();i++){
                    if(s.charAt(i)==target || s.charAt(i)==target+32)
                        cnt++;
                }
            }
            else{ // 소문자
                for(int i=2;i<s.length();i++){
                    if(s.charAt(i)==target || s.charAt(i)==target-32)
                        cnt++;
                }
            }
            sb.append(target);
            sb.append(" ");
            sb.append(cnt);
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
