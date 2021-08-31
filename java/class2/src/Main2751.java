import java.lang.reflect.Array;
import java.util.*;
import java.io.*;

public class Main2751 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        boolean[] num = new boolean[2000001];
        int gap = 1000000;

        for(int i=0;i<N;i++){
            num[Integer.parseInt(br.readLine())+gap] = true;
        }

        for(int i=0;i<num.length;i++){
            if(num[i]){
                sb.append(i-gap).append('\n');
            }
        }

        System.out.println(sb);

        /*
        int [] num = new int[N];

        for(int i=0;i<N;i++){
            num[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(num);

        for(int i=0;i<num.length;i++){
            sb.append(num[i]+"\n");
        }
        System.out.println(sb);
         */
    }
}