import java.io.*;
import java.util.*;

public class Main11720 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int sum=0;
        String s = br.readLine();
        for(int i=0;i<N;i++){
            sum+=s.charAt(i)-'0';
        }
        System.out.println(sum);
    }
}
