import java.util.*;
import java.io.*;

public class Main2953 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int num = 0;
        int max = 0;
        for(int i=1;i<=5;i++){
            int sum = 0;
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<4;j++)
                sum+=Integer.parseInt(st.nextToken());
            if(max<sum){
                max = sum;
                num = i;
            }
        }
        System.out.println(num+" "+max);
    }
}