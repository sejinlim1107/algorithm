import java.util.*;
import java.io.*;

public class Main1459 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken()); // 한블럭
        int s = Integer.parseInt(st.nextToken()); // 대각선

        if(w*2 > s){ // 대각선이 이득인 경우
            int t = 0;
            t = (x+y-(y*2))*w;
            t += y*s;
            System.out.println(t);
        }
        else // 다 블럭으로만 갔을 때
            System.out.println((x+y)*w);
    }
}
