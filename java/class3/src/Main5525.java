import java.util.*;
import java.io.*;

public class Main5525 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); // O가 N개
        int len = Integer.parseInt(br.readLine());
        int answer = 0;
        char[] str = br.readLine().toCharArray();
        int[] keep = new int[len];
        for(int i=1;i<len-1;i++){ // OI를 셀거라서 i=1부터임. i랑 i+1 비교할거라서 i<len-1까지만 해야함
            if(str[i]=='O' && str[i+1]=='I') {
                keep[i + 1] = keep[i - 1] + 1;
                if (keep[i + 1] >= n && str[i + 1 - 2 * n] == 'I') // 위의 if문에서 keep[i+1]을 증가시켰어야 이 if문의 조건을 만족할 수 있음
                    answer++;
            }
        }
        System.out.println(answer);
    }
}
