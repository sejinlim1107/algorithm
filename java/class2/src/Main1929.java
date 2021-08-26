import java.util.*;
import java.io.*;

public class Main1929 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuffer sb = new StringBuffer();

        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        boolean prime = false;

        for(int i=M; i<=N; i++){
            for(int j=2; j<=(int)Math.sqrt(i/2);j++){
                if(i % j == 0){
                    prime = false;
                    break;
                }
                prime = true;
            }
            if(prime)
                sb.append(i+"\n");
            prime = true;
        }
        //System.out.println(sb);
    }
}
