import java.io.*;
import java.util.*;

public class Main1541 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split("-");
        int answer = 0;
        int tmp = 0;
        for(int i=0;i<s.length;i++){
            if(s[i].contains("+")){
                String[] num = s[i].split("\\+");
                tmp = 0;
                for(int j=0;j<num.length;j++){
                    if(i==0)
                        answer+=Integer.parseInt(num[j]);
                    else{
                        tmp+=Integer.parseInt(num[j]);
                    }
                }
                answer-=tmp;
            }
            else{
                if(i==0)
                    answer+=Integer.parseInt(s[i]);
                else answer-=Integer.parseInt(s[i]);
            }
        }
        System.out.println(answer);
    }
}
