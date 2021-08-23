import java.util.*;
import java.io.*;

public class Main1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());

        int max = 0;
        double avg = 0;

        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            if(max < arr[i]) {
                max = arr[i];
            }
            avg += arr[i];
        }

        System.out.println(avg/max*100/N);
    }
}
