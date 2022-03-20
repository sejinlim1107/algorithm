import java.io.*;
import java.util.*;

public class Main2443 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i=n;i>0;i--){
            for(int j=0;j<2*i-1;j++)
                sb.append("*");
            sb.append("\n");
            for(int k=0;k<=n-i;k++)
                sb.append(" ");
        }
        System.out.println(sb);
    }
}
