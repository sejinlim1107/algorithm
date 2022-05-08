import java.io.*;

public class Main5988 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        while(t-->0){
            String k = br.readLine();
            if((k.charAt(k.length()-1)-'0')%2==0)
                sb.append("even").append("\n");
            else
                sb.append("odd").append("\n");
        }
        System.out.println(sb);
    }
}