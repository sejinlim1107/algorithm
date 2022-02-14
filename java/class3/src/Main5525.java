import java.util.*;
import java.io.*;

public class Main5525 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); // O가 N개
        int len = Integer.parseInt(br.readLine());
        int cnt = 0; // IO 개수
        int total = 0;;
        String s = br.readLine();
        for(int i=0;i<len;i++){
            if(s.charAt(i) == 'I'){
                if(i+1<len && s.charAt(i+1)=='O'){
                    cnt++;
                    i++;
                }
            }
        }
        System.out.println(cnt);
    }
}
