import java.util.*;
import java.io.*;

public class Main8958 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int T = Integer.parseInt(br.readLine());
        int combo = 0;
        int sum = 0;

        for(int i=0; i<T; i++){
            String s = br.readLine();
            for(int j=0; j<s.length(); j++){
                if(s.charAt(j) == 'O'){
                    combo++;
                    sum+=combo;
                }
                else
                    combo = 0;
            }
            sb.append(sum+"\n");
            sum = 0;
            combo = 0;
        }
        System.out.println(sb);
    }

}
