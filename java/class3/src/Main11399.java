import java.util.*;
import java.io.*;

public class Main11399 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] time = new int[n];
        int min = 0;

        for(int i=0;i<n;i++){
            time[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(time);
        min += time[0];
        for(int i=1;i<n;i++){
            time[i] = time[i-1]+time[i];
            min += time[i];
        }

        System.out.println(min);
    }
}