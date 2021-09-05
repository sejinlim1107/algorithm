import java.util.*;
import java.io.*;

public class Main2839 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int [] d = new int[N+1];
        d[1] = -1;
        d[2] = -1;
        d[3] = 1;
        if(N>=4)
            d[4] = -1;

        for(int i=5;i<=N;i++){
            if(i%3==0 || d[i-3] > 0)
                d[i] = d[i-3]+1;
            if(i%5==0 || d[i-5] > 0) {
                if(d[i] != 0)
                    d[i] = Math.min(d[i],d[i-5]+1);
                else
                    d[i] = d[i-5]+1;
            }
            if(d[i] == 0)
                d[i] = -1;
        }
        System.out.println(d[N]);
    }
}

