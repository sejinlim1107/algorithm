import java.util.*;
import java.io.*;

public class Main2805 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int [] h = new int[n];
        st = new StringTokenizer(br.readLine());

        for(int i=0;i<n;i++){
            h[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(h);

        int len = h[h.length-1];

        while(true){
            long all = 0;
            for(int i=0;i<n;i++){
                int tmp = h[i] - len;
                if(tmp>0){
                    all += tmp;
                }
            }
            if(all == m){
                System.out.println(len);
                return;
            }
            else if(all > m){
                System.out.println(++len);
                return;
            }
            len--;
        }
    }
}
