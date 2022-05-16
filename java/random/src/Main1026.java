import java.io.*;
import java.util.*;

public class Main1026 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        int[] b = new int[n];
        int sum = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            a[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(a);
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            b[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(b);
        for(int i=0;i<n;i++)
            sum += b[n-i-1] * a[i];
        System.out.println(sum);
    }
}