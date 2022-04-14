import java.util.*;
import java.io.*;

public class Main4493 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        for(int i=0;i<t;i++){
            int n = Integer.parseInt(br.readLine());
            int p1 = 0;
            int p2 = 0;
            for(int j=0;j<n;j++){
                st = new StringTokenizer(br.readLine());
                String player1 = st.nextToken();
                String player2 = st.nextToken();
                if((player1.equals("R")&&player2.equals("S")) || (player1.equals("S")&&player2.equals("P")) || (player1.equals("P")&&player2.equals("R")))
                    p1++;
                else if((player1.equals("R")&&player2.equals("P")) || (player1.equals("S")&&player2.equals("R")) || (player1.equals("P")&&player2.equals("S")))
                    p2++;
            }
            if(p1 == p2)
                sb.append("TIE").append("\n");
            else if(p1>p2)
                sb.append("Player 1").append("\n");
            else
                sb.append("Player 2").append("\n");
        }
        System.out.println(sb);
    }
}