import java.util.*;
import java.io.*;

public class Main10950 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        int a,b;
        String str;

        for(int i=0;i<T;i++){
            str = br.readLine();
            a = Integer.parseInt(str.split(" ")[0]);
            b = Integer.parseInt(str.split(" ")[1]);
            System.out.println(a+b);
        }
    }
}
