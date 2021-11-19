import java.util.*;
import java.io.*;

public class Main15881 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        int answer = 0;

        for(int i=0;i<n;i++){
            if(s.charAt(i) == 'p' && i+3<n){
                if(s.substring(i,i+4).equals("pPAp")) {
                    answer++;
                    i+=3; //반복문 끝나면 i++을 함!
                }
            }
        }
        System.out.println(answer);
    }
}
