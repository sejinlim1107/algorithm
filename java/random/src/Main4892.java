import java.io.*;
import java.util.*;

public class Main4892 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int i = 1;
        int n4;
        while(true){
            int n0 = Integer.parseInt(br.readLine());
            if(n0==0)
                break;
            int n1 = 3*n0;
            sb.append(i+". ");
            if(n1%2==0) {
                n4 = n0/2;
                sb.append("even "+n4).append("\n");
            }
            else {
                n4 = (n0-1)/2;
                sb.append("odd "+n4).append("\n");
            }
            i++;
        }
        System.out.println(sb);
    }
}
