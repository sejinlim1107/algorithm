import java.util.*;
import java.io.*;

public class Main4673 {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        boolean[] num = new boolean[10001];

        for(int i=1;i<=10000;i++){
            int tmp = i;
            int sum = tmp;
            while(tmp>0){
                sum += tmp%10;
                tmp /= 10;
            }
            if(sum<=10000)
                num[sum] = true;
        }

        for(int i=1;i<=10000;i++){
            if(!num[i])
                sb.append(i).append("\n");
        }

        System.out.println(sb);
    }
}
