import java.util.*;
import java.io.*;

public class Main9076 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        while(t-->0){
            st = new StringTokenizer(br.readLine());
            int[] scores = new int[5];
            for(int i=0;i<5;i++){
                scores[i] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(scores);
            if(scores[3]-scores[1] >= 4){
                sb.append("KIN").append("\n");
            }
            else{
                sb.append(scores[1]+scores[2]+scores[3]).append("\n");
            }
        }
        System.out.println(sb);
    }
}