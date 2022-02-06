import java.util.*;
import java.io.*;

public class Main13752 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++){
            int tmp = Integer.parseInt(br.readLine());
            for(int j=0;j<tmp;j++){
                sb.append("=");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
