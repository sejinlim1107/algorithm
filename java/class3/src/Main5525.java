import java.util.*;
import java.io.*;

public class Main5525 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int len = Integer.parseInt(br.readLine());
        int cnt = 0;
        int total = 0;
        int tmp = 0;
        int preCnt = 0;
        String s = br.readLine();
        for(int i=0;i<len;i++){
            if(cnt%2==0 && s.charAt(i)=='I'){ // I
                cnt++;
            }
            else if(cnt%2==1 && s.charAt(i)=='O') { // O
                cnt++;
            }
            if(preCnt == cnt) // 연속해서 cnt가 변하지 않으면
                cnt = 0;
            if(cnt==1)
                tmp = i;
            preCnt = cnt;
            if(cnt == 2*n+1) {
                cnt = 0;
                i = tmp + 2;
                total++;
            }
        }
        System.out.println(total);
    }
}
