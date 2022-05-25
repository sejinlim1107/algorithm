import java.io.*;
import java.util.*;

public class Main11034 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        String input = "";
        while((input = br.readLine()) != null){
            st = new StringTokenizer(input);
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            System.out.println(Math.max(b-a, c-b)-1);
        }
    }
    /*
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        String input = "";
        while((input = br.readLine()) != null){
            st = new StringTokenizer(input);
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            int cnt = 0;
            while(c-a > 2){
                if(b-a > c-b){
                    c = b;
                    b--;
                }
                else{
                    a = b;
                    b++;
                }
                cnt++;
            }
            System.out.println(cnt);
        }
    }
    */
}