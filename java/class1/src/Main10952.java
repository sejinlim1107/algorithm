import java.util.*;
import java.io.*;

public class Main10952 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        String str;
        int a,b;

        while(true){
            if((str=br.readLine()).equals("0 0"))
                break;
            else{
                a = str.charAt(0)-'0';
                b = str.charAt(2)-'0';
                sb.append(a+b+"\n");
            }
        }
        System.out.println(sb);
    }
}
