import java.io.*;
import java.util.*;

public class Main10214 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        while(t-->0){
            int k = 0;
            int y = 0;
            for(int i=0;i<9;i++){
                st = new StringTokenizer(br.readLine());
                y+=Integer.parseInt(st.nextToken());
                k+=Integer.parseInt(st.nextToken());
            }
            if(k>y)
                sb.append("Korea").append("\n");
            else if(k<y)
                sb.append("Yonsei").append("\n");
            else
                sb.append("Draw").append("\n");
        }
        System.out.println(sb);
    }
}