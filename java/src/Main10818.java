import java.util.*;
import java.io.*;

public class Main10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int max = arr[0];
        int min = arr[0];

        for(int i=1;i<N;i++){
            if(max < arr[i])
                max = arr[i];
            else if(min > arr[i])
                min = arr[i];
        }

        System.out.println(min+" "+max);
    }
}
