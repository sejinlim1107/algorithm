import java.util.*;
import java.io.*;

public class Main2439 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());

        for(int i=0; i<N; i++){
            for(int j=0;j<N-i-1;j++)
                System.out.print(" ");
            for(int j=0; j<i+1; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}
