import java.io.*;
import java.util.*;

// https://mygumi.tistory.com/325 이 블로그 보고 품
public class Main6064 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        for(int i=0;i<t;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int m = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int last = m*n/gcd(m,n); // m과 n의 최소공배수가 마지막 해임
            int cnt = x%(m+1); // 맨 처음엔 x를 가져가야하는데 x가 m보다 큰 수 일수도 있어서
            int searchY = x; // while문에서 searchY % N 해주면 그때그떄의 y값을 알 수 있음
            for(int j=0;j<n;j++){ // 이 for문을 다 돌면 무조건 cnt가 last보다 커짐
                searchY %= n;
                if(searchY == 0)
                    searchY = n;
                if(searchY == y)
                    break;
                searchY += m;
                cnt += m;
            }
            sb.append(cnt > last ? -1 : cnt).append("\n");
        }
        System.out.println(sb);
    }
    public static int gcd(int n1, int n2){
        if(n2==0)
            return n1;
        else
            return gcd(n2, n1%n2);
    }
}
