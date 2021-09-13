import java.util.*;
import java.io.*;

public class Main7568 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int[] height = new int[n];
        int[] weight = new int[n];

        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            height[i] = Integer.parseInt(st.nextToken());
            weight[i] = Integer.parseInt(st.nextToken());
        }

        for(int i=0;i<n;i++){
            int p = 0; //나보다 덩치 큰 사람 수
            for(int j=0;j<n;j++){
                if(i!=j && height[i] < height[j] && weight[i] < weight[j]){
                    p++;
                }
            }
            sb.append(p+1).append(" ");
        }
        System.out.println(sb);
    }
}
