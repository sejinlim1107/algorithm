import java.util.*;
import java.io.*;

public class Main1009 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int answer = pow(a,b);
            if(answer == 0)
                answer = 10;
            sb.append(answer).append("\n");
        }
        System.out.println(sb);
    }

    public static int pow(int a, int b){
        int answer = 1;
        for(int i=0;i<b;i++){
            answer *= a;
            answer %= 10;
        }

        return answer;
    }
}
