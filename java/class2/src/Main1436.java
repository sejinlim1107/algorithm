import java.util.*;
import java.io.*;

public class Main1436 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int ans = 0;
        int num = 666;

        while(true){
            if(Integer.toString(num).contains("666")){
                ans++;
            }
            if(ans >= N){
                System.out.println(num); //
                return;
            }
            num++;
        }
    }
}

