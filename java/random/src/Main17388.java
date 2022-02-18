import java.io.*;
import java.util.*;

public class Main17388 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        if(a+b+c >= 100){
            System.out.println("OK");
        }
        else {
            if(a<b){
                if(c<a)
                    System.out.println("Hanyang");
                else
                    System.out.println("Soongsil");
            }
            else{
                if(c<b)
                    System.out.println("Hanyang");
                else
                    System.out.println("Korea");
            }
        }
    }
}
