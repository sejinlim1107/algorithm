import java.util.*;
import java.io.*;

public class Main9713 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        for(int i=0;i<t;i++){
            int tmp = Integer.parseInt(br.readLine());
            int sum = 0;
            for(int j=1;j<=tmp;j+=2){
                sum+=j;
            }
            sb.append(sum).append("\n");
        }
        System.out.println(sb);
    }
}
