import java.util.*;
import java.io.*;

public class Main2581 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        int min = -1;
        boolean[] isPrime = new boolean[n+1];
        Arrays.fill(isPrime, true);
        isPrime[1] = false;
        int sum = 0;

        for(int i=2;i<=(int)Math.sqrt(n);i++){
            if(!isPrime[i])
                continue;
            for(int j=2*i;j<=n;j+=i){ // 소수 자신은 제외해야해서 i*2부터!
                isPrime[j] = false;
            }
        }

        for(int i=m;i<=n;i++){
            if(isPrime[i]){
                if(min == -1)
                    min = i;
                sum+=i;
            }
        }
        if(min == -1){
            sb.append(-1).append("\n");
        }
        else {
            sb.append(sum).append("\n");
            sb.append(min).append("\n");
        }
        System.out.println(sb);
    }
}