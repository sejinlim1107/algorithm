import java.awt.im.spi.InputMethod;
import java.util.*;
import java.io.*;

public class Main1978 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        boolean flag = true;
        int cnt = 0;

        for(int i=0;i<N;i++){
            int num = Integer.parseInt(st.nextToken());
            if(num == 1)
                continue;
            for(int j=2;j<=(int)Math.sqrt(num);j++){
                if(num%j == 0){
                    flag = false;
                    break;
                }
            }
            if(flag)
                cnt++;

            flag = true;
        }
        System.out.println(cnt);
    }
}
