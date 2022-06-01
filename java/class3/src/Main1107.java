import java.util.*;
import java.io.*;

public class Main1107 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer("");
        int target = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        if(m>0)
            st = new StringTokenizer(br.readLine());
        boolean[] button = new boolean[10];
        int min = Math.abs(target-100); // 현재 채널에서 +-로만 가는 경우
        for(int i=0;i<m;i++){
            button[Integer.parseInt(st.nextToken())] = true;
        }
        for(int i=0;i<=999999;i++){
            boolean flag = false;
            String s = Integer.toString(i);
            int len = s.length();
            for(int j=0;j<len;j++){
                if(button[s.charAt(j)-'0']){ // 고장난 버튼을 누르면
                    flag = true;
                    break;
                }
            }
            if(min == 0)
                break;
            if(!flag) {
                int tmp = Math.abs(target-i)+len;
                if(min > tmp)
                    min = tmp;
            }
        }
        System.out.println(min);
    }
}