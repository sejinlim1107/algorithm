import java.io.*;
import java.util.*;

public class Main2744 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String s = br.readLine();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) < 'a') // 대문자
                sb.append((char)(s.charAt(i)+'a'-'A'));
            else
                sb.append((char)(s.charAt(i)-('a'-'A')));
        }
        System.out.println(sb);
    }
}