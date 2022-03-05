import java.io.*;

public class Main1100 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = 0;
        for(int i=0;i<8;i++){
            String row = br.readLine();
            int start;
            if(i%2==0)
                start = 0;
            else
                start = 1;
            for(int j=start;j<8;j+=2){
                if(row.charAt(j)=='F')
                    cnt++;
            }
        }
        System.out.println(cnt);
    }
}