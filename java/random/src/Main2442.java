import java.io.*;
import java.util.*;

public class Main2442 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        for(int i=0;i<=n;i++){
            for(int j=n;j>i;j--)
                sb.append(" ");
            for(int k=0;k<2*i-1;k++)
                sb.append("*");
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
