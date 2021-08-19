import java.util.*;
import java.io.*;

public class Main2884 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int H = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int r = M - 45;

        if(r < 0)
            System.out.println((23+H)%24+" "+ (r+60)); //23+H == 24+H-1
        else
            System.out.println(H+" "+r);
    }
}
