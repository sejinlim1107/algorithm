import java.util.*;
import java.io.*;

public class Main1654 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int k = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int[] num = new int[k];

        for(int i=0;i<k;i++){
            num[i] = Integer.parseInt(br.readLine());
        }
    }
}
