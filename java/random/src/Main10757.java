import java.util.*;
import java.io.*;

public class Main10757 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        String s1 = st.nextToken();
        String s2 = st.nextToken();
        int len = Math.max(s1.length(), s2.length());
        int[] a = new int[len + 1];
        int[] b = new int[len + 1];

        // a 셋팅
        for (int i = 0; i < s1.length(); i++) {
            a[i] = s1.charAt(s1.length() - i - 1) - '0';
        }

        // b 셋팅
        for (int i = 0; i < s2.length(); i++) {
            b[i] = s2.charAt(s2.length() - i - 1) - '0';
        }

        // A+B
        for(int i=0;i<len;i++){
            b[i] = a[i]+b[i];
            if(b[i]>=10){
                b[i] %= 10;
                b[i+1]++;
            }
        }

        // 맨 앞자리에 0이 출력되지 않게 검사 후 조치
        if(b[len]==0)
            len--;
        // 출력
        for(int i=len;i>=0;i--){
            sb.append(b[i]);
        }
        System.out.println(sb);
    }
}