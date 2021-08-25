import java.util.*;
import java.io.*;

public class Main4153 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String s = br.readLine();
        StringTokenizer st;
        int a,b,c,lon;

        while(!s.equals("0 0 0")){
            st = new StringTokenizer(s);
            a = (int)Math.pow(Integer.parseInt(st.nextToken()),2);
            b = (int)Math.pow(Integer.parseInt(st.nextToken()),2);
            c = (int)Math.pow(Integer.parseInt(st.nextToken()),2);

            if(c == a+b)
                sb.append("right\n");
            else if(b == a+c)
                sb.append("right\n");
            else if(a == b+c)
                sb.append("right\n");
            else
                sb.append("wrong\n");
            /*
            if(a<b){
                if(b<c){
                    if(c == a+b)
                        sb.append("right\n");
                    else
                        sb.append("wrong\n");
                }
                else{
                    if(b == a+c)
                        sb.append("right\n");
                    else
                        sb.append("wrong\n");
                }
            }
            else{
                if(a<c){
                    if(c == a+b)
                        sb.append("right\n");
                    else
                        sb.append("wrong\n");
                }
                else{
                    if(a == c+b)
                        sb.append("right\n");
                    else
                        sb.append("wrong\n");
                }
            }
             */
            s = br.readLine();
        }
        System.out.println(sb);
    }
}
