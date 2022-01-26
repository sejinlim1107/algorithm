import java.util.*;
import java.io.*;

public class Main2941 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int cnt=s.length();
        String[] alpha = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        for(int i=0;i<alpha.length;i++){
            for(int j=0;j<s.length();j++){
                if(s.charAt(j) == alpha[i].charAt(i)){

                }
            }
            if(s.contains(alpha[i])){
                cnt -= alpha[i].length()-1;
            }
        }
        System.out.println(cnt);
    }
}
