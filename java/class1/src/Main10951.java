import java.util.*;
import java.io.*;

public class Main10951 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        String str = "";
        int a, b;

        while(true){
            if((str=br.readLine()) == null)
                break;
            else{
                st = new StringTokenizer(str);
                a = Integer.parseInt(st.nextToken());
                b = Integer.parseInt(st.nextToken());
                System.out.println(a+b);
            }
        }
    }
}
