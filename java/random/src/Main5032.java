import java.util.*;
import java.io.*;

public class Main5032 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int e = Integer.parseInt(st.nextToken());
        int f = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int sum = 0;
        int bottle = e+f;
        while(bottle/c > 0){
            sum += bottle / c;
            bottle = (bottle/c)+(bottle%c);
        }
        System.out.println(sum);
    }
}
