import java.util.*;
import java.io.*;

public class Main21567 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        long mul = 1;
        int[] num = new int[10];
        for(int i=0;i<3;i++){
            mul *= Integer.parseInt(br.readLine());
        }
        String s = Long.toString(mul);
        for(int i=0;i<s.length();i++){
            num[s.charAt(i)-'0']++;
        }
        for(int i=0;i<10;i++){
            sb.append(num[i]).append("\n");
        }
        System.out.println(sb);
    }
}