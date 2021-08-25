import java.util.*;
import java.io.*;

public class Main1085 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        int xx = (w-x) < x ? w-x : x;
        int yy = (h-y) < y ? h-y : y;

        if(xx > yy)
            System.out.println(yy);
        else
            System.out.println(xx);
    }
}
