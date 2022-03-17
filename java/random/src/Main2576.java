import java.io.*;

public class Main2576 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<7;i++){
            int tmp = Integer.parseInt(br.readLine());
            if(tmp%2==1) {
                sum += tmp;
                if(min > tmp)
                    min = tmp;
            }
        }
        if(sum == 0)
            System.out.println(-1);
        else {
            System.out.println(sum);
            System.out.println(min);
        }
    }
}