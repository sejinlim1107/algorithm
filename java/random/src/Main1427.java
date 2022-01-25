import java.io.*;
import java.util.*;

public class Main1427 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String s = br.readLine();
        Integer[] num = new Integer[s.length()];
        for(int i=0;i<s.length();i++){
            num[i] = s.charAt(i)-'0';
        }
        Arrays.sort(num, Collections.reverseOrder());
        for(int i=0;i<s.length();i++){
            sb.append(num[i]);
        }
        System.out.println(sb);
    }
}