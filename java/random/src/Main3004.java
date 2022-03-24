import java.io.*;

public class Main3004 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int r = n/2+1;
        int c = n-n/2+1;
        System.out.println(r*c);
    }
}