import java.util.*;
import java.io.*;

public class Main2292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int ans = 1;
        int bee = 1;
        int i=1;

        while(bee < N){
            ans++;
            bee += 6*i;
            i++;
        }

        System.out.println(ans);
    }
}
