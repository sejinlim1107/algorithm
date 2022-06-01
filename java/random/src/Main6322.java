import java.io.*;
import java.util.*;

public class Main6322 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int[] side = new int[3];
        int cnt = 1;
        while(true){
            String s = br.readLine();
            if(s.equals("0 0 0"))
                break;
            st = new StringTokenizer(s);
            sb.append("Triangle #").append(cnt).append("\n");
            boolean flag = false; // -1이 빗변(c)인 경우에 true
            double answer = 0;
            char tmp = 'a';
            for(int i=0;i<3;i++){
                side[i] = Integer.parseInt(st.nextToken());
                if(side[i] == -1)
                   tmp += i;
            }
            if(flag){ // c==-1
                answer = Math.pow(side[0],2)+Math.pow(side[1],2);
                if(answer>0)
                    sb.append(Math.sqrt(answer)).append("\n").append("\n");
            }
            cnt++;
        }
    }
}
