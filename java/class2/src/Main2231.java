import java.util.*;
import java.io.*;

public class Main2231 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int n = Integer.parseInt(s);
        int cre = 0;

        for(int i=n-s.length()*9;i<n;i++){
            cre = 0;
            cre += i;
            String num = Integer.toString(i);

            for(int j=0;j<num.length();j++){
                cre += num.charAt(j)-'0';
            }

            if(cre == n){
                System.out.println(i);
                return;
            }
        }
        System.out.println(0);

        /*int n = Integer.parseInt(br.readLine());
        int cre = 0;
        int min = 0;
        int ex;

        for (int i = n-1; i >= 1; i--) {
            cre = 0;
            ex = i;
            cre += ex;
            while(ex!=0){
                cre += ex%10;
                ex /= 10;
            }
            if(cre == n)
                min = i;
        }
        System.out.println(min);

         */
    }
}
