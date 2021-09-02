import java.util.*;
import java.io.*;

public class Main15829 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String s = br.readLine();
        int prime = 1234567891;
        long r=1;
        long sum = 0;

        for(int i=0;i<N;i++){
            sum += ((s.charAt(i)-'a'+1)*r)%prime;
            r = (r*31)%prime;
        }

        System.out.println(sum%prime);
    }
}

