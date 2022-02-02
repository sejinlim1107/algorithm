import java.util.*;
import java.io.*;

public class Main2752 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        if (a < b) {
            if (b < c)
                System.out.println(a + " " + b + " " + c + " ");
            else if (a < c)
                System.out.println(a + " " + c + " " + b + " ");
            else
                System.out.println(c + " " + a + " " + b + " ");
        } else {
            if (b > c)
                System.out.println(c + " " + b + " " + a + " ");
            else if (a > c)
                System.out.println(b + " " + c + " " + a + " ");
            else
                System.out.println(b + " " + a + " " + c + " ");
        }
    }
    /*
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] num = new int[3];
        num[0] = Integer.parseInt(st.nextToken());
        num[1] = Integer.parseInt(st.nextToken());
        num[2] = Integer.parseInt(st.nextToken());
        Arrays.sort(num);
        System.out.println(num[0]+" "+num[1]+" "+num[2]+" ");
    }
    */
}
