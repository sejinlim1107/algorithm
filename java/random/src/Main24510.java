import java.util.*;
import java.io.*;

public class Main24510 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int answer = 0;
        for(int i=0;i<n;i++){
            String s = br.readLine();
            int tmp = 0;
            for(int j=0;j<s.length()-2;j++){
                if(s.charAt(j) == 'f' && s.charAt(j+1) == 'o' && s.charAt(j+2) == 'r') {
                        tmp++;
                        j+=2;
                }
                else if(j < s.length()-4 && s.charAt(j) == 'w' && s.charAt(j + 1) == 'h' && s.charAt(j + 2) == 'i' && s.charAt(j + 3) == 'l' && s.charAt(j + 4) == 'e') {
                        tmp++;
                        j += 4;
                }
            }
            answer = Math.max(answer, tmp);
        }
        System.out.println(answer);
    }
}
