import java.io.*;

public class Main23795 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        while(true){
            int n = Integer.parseInt(br.readLine());
            if(n == -1)
                break;
            sum += n;
        }
        System.out.println(sum);
    }
}