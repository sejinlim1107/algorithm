import java.io.*;
import java.util.*;

public class Main20499 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(),"/");
        int k = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int a = Integer.parseInt(st.nextToken());
        if(d == 0 || k+a < d)
            System.out.println("hasu");
        else
            System.out.println("gosu");
    }
}