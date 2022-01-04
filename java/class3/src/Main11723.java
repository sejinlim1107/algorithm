import java.util.*;
import java.io.*;

public class Main11723 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(br.readLine());
        StringTokenizer st;
        HashSet<Integer> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<m;i++){
            st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            if(s.contains("add")){
                int n = Integer.parseInt(st.nextToken());
                set.add(n);
            }
            else if(s.contains("check")){
                int n = Integer.parseInt(st.nextToken());
                if(set.contains(n))
                    sb.append(1).append("\n");
                else
                    sb.append(0).append("\n");
            }
            else if(s.contains("remove")){
                int n = Integer.parseInt(st.nextToken());
                set.remove(n);
            }
            else if(s.contains("toggle")){
                int n = Integer.parseInt(st.nextToken());
                if(set.contains(n))
                    set.remove(n);
                else
                    set.add(n);
            }
            else if(s.contains("all")){
                set.clear();
                for(int j=1;j<=20;j++){
                    set.add(j);
                }
            }
            else if(s.contains("empty")){
                set.clear();
            }
        }
        System.out.println(sb);
    }
}
