import java.io.*;
import java.util.*;

public class Main21300 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int sum = 0;
        for(int i=0;i<6;i++){
            sum += Integer.parseInt(st.nextToken());
        }
        System.out.println(sum*5);
    }
}