import java.util.*;
import java.io.*;

public class Main1259 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        boolean flag = true;

        while(true){
            String s = br.readLine();
            if(s.equals("0"))
                break;

            for(int i=0;i<Math.round(s.length()/2);i++){
                if(s.charAt(i) != s.charAt(s.length()-1-i)){
                    sb.append("no\n");
                    flag = false;
                    break;
                }
            }
            if(flag)
                sb.append("yes\n");
            flag = true;
            }
        System.out.println(sb);
    }
}
