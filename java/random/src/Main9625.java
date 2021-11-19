import java.util.*;
import java.io.*;

public class Main9625 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine());
        int na = 1;
        int nb = 0;
        int ba = 1; //전
        int bb = 0; //전

        for(int i=0;i<k;i++){
            nb = ba + bb; //a가 다 b로 변하니까
            na = bb;
            ba = na;
            bb = nb;
        }

        System.out.println(na+" "+nb);
    }
}
