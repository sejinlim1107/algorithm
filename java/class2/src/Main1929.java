import java.util.*;
import java.io.*;

public class Main1929 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int [] isPrime = new int[N+1];

        for(int i=2;i<=N;i++){
            isPrime[i] = i;
        }

        for(int i=2;i<=(int)Math.sqrt(N);i++){
            if(isPrime[i] == 0) continue;
            for(int j=2*i;j<=N;j+=i){
                isPrime[j] = 0;
            }
        }

        for(int i=M;i<=N;i++){
            if(isPrime[i] != 0){
                sb.append(isPrime[i]+"\n");
            }
        }

        System.out.println(sb);
    }
}
