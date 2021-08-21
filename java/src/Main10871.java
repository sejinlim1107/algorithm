import java.util.*;
import java.io.*;

public class Main10871 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());
        int num;

        st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            num = Integer.parseInt(st.nextToken());
            if(X > num)
                System.out.print(num+" ");
        }
        System.out.println();
    }
}
