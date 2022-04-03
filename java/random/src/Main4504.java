import java.util.*;
import java.io.*;

public class Main4504 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        while(true){
            int tmp = Integer.parseInt(br.readLine());
            if(tmp==0)
                break;
            if(tmp%n==0)
                sb.append(tmp+" is a multiple of "+n+".\n");
            else
                sb.append(tmp+" is NOT a multiple of "+n+".\n");
        }
        System.out.println(sb);
    }
}
