import java.util.*;
import java.io.*;

public class Main11050 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int ans = 1;
        int div = 1;

        K = (N-K)<K ? N-K : K;
        int tmp = K;
        for(int i=1;i<=K;i++){
            ans *= N--;
            if(tmp!=0) {
                div *= tmp--;
            }
        }

        System.out.println(ans/div);
    }
}
