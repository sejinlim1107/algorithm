import java.util.*;
import java.io.*;

public class Main22938 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x1 = Integer.parseInt(st.nextToken());
        int y1 = Integer.parseInt(st.nextToken());
        int r1 = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int x2 = Integer.parseInt(st.nextToken());
        int y2 = Integer.parseInt(st.nextToken());
        int r2 = Integer.parseInt(st.nextToken());
        int len = (int)Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));  // 각 중심끼리의 거리구하기
        if(r1+r2 > len) // 두 원의 반지름의 합 > 두 원의 중심 사이의 거리 // 겹친다
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}