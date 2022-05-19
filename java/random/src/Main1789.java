import java.io.*;

public class Main1789 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Long s = Long.parseLong(br.readLine());
        int num = 0;
        while(s >= 1){
            num++;
            s -= num;
        }
        if(s==0)
            System.out.println(num);
        else
            System.out.println(num-1);
    }
}