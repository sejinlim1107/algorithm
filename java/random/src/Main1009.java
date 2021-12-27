import java.util.*;
import java.io.*;

public class Main1009 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int answer = 0;
            a = a%10;
            if(a == 0){
                answer = 10;
            }
            else if(a == 1 || a == 5 || a == 6)
                answer = a;
            else if(a == 2 || a == 3 || a == 7 || a == 8){
                b = b%4;
                if(b==0)
                    b = 4;
                answer = (int)Math.pow(a,b) % 10;
            }
            else if(a == 4 || a == 9){
                b = b%2;
                if(b==0)
                    b = 2;
                answer = (int)Math.pow(a,b) % 10;
            }
            sb.append(answer).append("\n");
        }
        System.out.println(sb);
    }

    /*
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int answer = pow(a,b);
            if(answer == 0)
                answer = 10;
            sb.append(answer).append("\n");
        }
        System.out.println(sb);
    }

    public static int pow(int a, int b){
        int answer = 1;
        for(int i=0;i<b;i++){
            answer *= a;
            answer %= 10;
        }

        return answer;
    }
     */
}
