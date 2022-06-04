import java.io.*;

public class Main10886 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int y = 0;
        int n = 0;
        while(t-->0){
            if(br.readLine().equals("0"))
                n++;
            else
                y++;
        }
        if(y>=n)
            System.out.println("Junhee is cute!");
        else
            System.out.println("Junhee is not cute!");
    }
}
