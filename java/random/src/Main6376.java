import java.util.*;
import java.io.*;

public class Main6376 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        sb.append("n e\n");
        sb.append("- -----------\n");
        sb.append("0 1\n");
        sb.append("1 2\n");
        sb.append("2 2.5\n");
        double sum = 2.5;
        for(int i=3;i<=9;i++){
            sb.append(i).append(" ");
            double mul = 1;
            for(int j=1;j<=i;j++){
                mul*=j;
            }
            sum += 1/mul;
            sb.append(String.format("%.9f", sum)).append("\n");
        }
        System.out.println(sb);
    }
}