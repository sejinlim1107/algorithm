import java.util.*;
import java.io.*;

public class Main1764 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        HashMap<String, Integer> map = new HashMap<>();
        int cnt = 0;
        ArrayList<String> keys = new ArrayList<>();

        for(int i=0;i<n+m;i++){
            String s = br.readLine();
            if(map.getOrDefault(s, 0) != 0){ // 이미 저장돼있으면
                cnt++;
                keys.add(s);
            }
            map.put(s,map.getOrDefault(s,0)+1);
        }
        sb.append(cnt).append("\n");
        keys.sort(Comparator.naturalOrder());
        for(int i=0;i<keys.size();i++) {
            sb.append(keys.get(i)).append("\n");
        }
        System.out.println(sb);
    }
}
