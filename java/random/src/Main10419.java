import java.io.*;
import java.util.*;

public class Main10419 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        for(int i=0;i<t;i++){
            int time = Integer.parseInt(br.readLine());
            for(int j=1;j<=time;j++){
                int study = j*j;
                if(study+j > time){ // 수업시간 + 지각시간
                    sb.append(j-1).append("\n");
                    break;
                }
            }
        }
        System.out.println(sb);
    }
}