import java.io.*;

public class Main1439 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int[] num = new int[2];
        int pre = -1;
        for(int i=0;i<s.length();i++){
            int tmp = s.charAt(i)-'0';
            if(pre == tmp)
                continue;
            pre = tmp;
            num[tmp]++;
        }
        System.out.println(Math.min(num[0],num[1]));
    }
}