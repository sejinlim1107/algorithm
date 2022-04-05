import java.util.*;
import java.io.*;

public class Main4458 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++){
            char[] tmp = br.readLine().toCharArray();
            if(tmp[0] >= 'a'){ // 첫 글자가 소문자면
                tmp[0] -= 'a'-'A';
                sb.append(tmp).append("\n");
            }
            else
                sb.append(tmp).append("\n");
        }
        System.out.println(sb);
    }
}
