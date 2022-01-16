import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main1676 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cnt = 0;

        while (n >= 5) {
            cnt += n / 5;
            n /= 5;
        }
        System.out.println(cnt);
    }

    /*
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cnt = 0;

        for(int i=n;i>4;i--){
            int tmp = i;
            while(tmp%5==0){
                tmp /= 5;
                cnt++;
            }
        }
        System.out.println(cnt);
    }
     */
}