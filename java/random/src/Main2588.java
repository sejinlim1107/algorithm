import java.io.*;
import java.util.*;

public class Main2588 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int tmp = b;

        System.out.println(a*(b%10));
        b = b/10;
        System.out.println(a*(b%10));
        b = b/10;
        System.out.println(a*(b%10));
        System.out.println(a*tmp);
    }
}
