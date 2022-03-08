import java.io.*;

public class Main23037 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int sum = 0;
        for(int i=0;i<5;i++){
            sum += (int)Math.pow(s.charAt(i)-'0',5);
        }
        System.out.println(sum);
    }
}