import java.util.*;
import java.io.*;

public class Main14582 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int[] wj = new int[9];
        int[] sg = new int[9];
        boolean win = false;
        int w = 0;
        int s = 0;
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<9;i++){
            wj[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<9;i++){
            sg[i] = Integer.parseInt(st.nextToken());
        }
        for(int i=0;i<9;i++){
            if(w+wj[i]>s || wj[i]>sg[i]) // 초, 말도 구분
                win = true;
            w+=wj[i];
            s+=sg[i];
        }
        if(win)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}