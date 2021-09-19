import java.util.*;
import java.io.*;

public class Main2108 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        int num[] = new int[N];
        double avg = 0;

        for(int i=0;i<N;i++) {
            num[i] = Integer.parseInt(br.readLine());
            avg += num[i];
        }

        Arrays.sort(num);
        sb.append(Math.round(avg/N)).append("\n");
        sb.append(num[(int)Math.floor(N/2)]).append("\n");
        sb.append(num[(int)Math.floor(N/2)]).append("\n");
        sb.append(num[N-1]-num[0]).append("\n");

        System.out.println(sb);
    }
}
