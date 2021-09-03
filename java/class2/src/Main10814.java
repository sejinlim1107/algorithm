import java.util.*;
import java.io.*;

public class Main10814 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        Map<Integer,String> member = new LinkedHashMap<Integer,String>();
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<N;i++){
            st= new StringTokenizer(br.readLine());
            member.put(Integer.parseInt(st.nextToken()),st.nextToken());
        }

        Object[] keys = member.keySet().toArray();
        Arrays.sort(keys);

        for(Integer key : member.keySet())
            sb.append(key+" "+member.get(key)).append("\n");

        System.out.println(sb);
    }
}

