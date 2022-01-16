import java.util.*;
import java.io.*;

public class Main2581 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        int min = -1;
        boolean[] isPrime = new boolean[n+1];
        int sum = 0;

        for(int i=1;i<(int)Math.sqrt(n+1);i++){
            if(!isPrime[i])
                continue;
            for(int j=2*i;j<n+1;j+=i){
                isPrime[j] = false;
            }
        }

        for(int i=0;i<n+1;i++){
            if(isPrime[i]){
                if(min == -1)
                    min = i;
                sum+=i;
            }
        }
        System.out.println(sum);
        System.out.println(min);
    }
}
