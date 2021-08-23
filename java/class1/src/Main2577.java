import java.util.*;
import java.io.*;

public class Main2577 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] num = new int[] {0,0,0,0,0,0,0,0,0,0};

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        String res = Integer.toString(a*b*c);

        for(int i=0;i<res.length();i++){
            num[res.charAt(i)-'0']++;
        }

        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
    }
}
