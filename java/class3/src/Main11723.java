import java.util.*;
import java.io.*;

public class Main11723 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int m = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int bitmask = 0;

        for(int i=0;i<m;i++){
            st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            if(s.contains("add")){
                int n = Integer.parseInt(st.nextToken());
                bitmask |= (1<<(n-1));
            }
            else if(s.contains("check")){
                int n = Integer.parseInt(st.nextToken());
                sb.append((bitmask & (1<<(n-1))) != 0 ? "1\n":"0\n");
            }
            else if(s.contains("remove")){
                int n = Integer.parseInt(st.nextToken());
                bitmask &= ~(1<<(n-1));
            }
            else if(s.contains("toggle")){
                int n = Integer.parseInt(st.nextToken());
                bitmask ^= (1<<(n-1));
            }
            else if(s.contains("all")){
                bitmask |= (~0);
            }
            else if(s.contains("empty")){
                bitmask = 0;
            }
        }
        bw.write(sb.toString());
        bw.close();
        /*
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        boolean[] set = new boolean[20];

        for(int i=0;i<m;i++){
            st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            if(s.contains("add")){
                int n = Integer.parseInt(st.nextToken());
                set[n-1] = true;
            }
            else if(s.contains("check")){
                int n = Integer.parseInt(st.nextToken());
                if(set[n-1])
                    sb.append(1).append("\n");
                else
                    sb.append(0).append("\n");
            }
            else if(s.contains("remove")){
                int n = Integer.parseInt(st.nextToken());
                set[n-1] = false;
            }
            else if(s.contains("toggle")){
                int n = Integer.parseInt(st.nextToken());
                if(set[n-1])
                    set[n-1] = false;
                else
                    set[n-1] = true;
            }
            else if(s.contains("all")){
                Arrays.fill(set, true);
            }
            else if(s.contains("empty")){
                Arrays.fill(set, false);
            }
        }
        System.out.println(sb);
         */

        /*
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
         */
    }
}
