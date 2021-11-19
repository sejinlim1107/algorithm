import java.util.*;
import java.io.*;

public class Main2748 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long[] arr = new long[n+1];
        arr[1] = 1;

        for(int i=2;i<arr.length;i++){
            arr[i] = arr[i-2]+arr[i-1];
        }

        System.out.println(arr[n]);
    }
}
