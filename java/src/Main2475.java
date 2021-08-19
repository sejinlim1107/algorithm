import java.util.*;
import java.io.*;

public class Main2475 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int num = 0;

        for (int i=0;i<5;i++){
            num += Math.pow(Integer.parseInt(st.nextToken()),2);
        }

        System.out.println(num%10);
    }
}
