import java.util.*;
import java.io.*;

public class Main7662 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        while(t-->0){
            int k = Integer.parseInt(br.readLine());
            TreeMap<Integer,Integer> map = new TreeMap<>();
            while(k-->0){
                StringTokenizer st = new StringTokenizer(br.readLine());
                String cal = st.nextToken();
                int n = Integer.parseInt(st.nextToken());
                if(cal.equals("I")){
                    map.put(n,map.getOrDefault(n,0)+1);
                }
                else{
                    if(!map.isEmpty()){
                        int key = n==1? map.lastKey():map.firstKey(); // lastKey가 최대, firstKey가 최소
                        if(map.put(key, map.get(key)-1)==1) // map.put은 원래의 value를 반환함
                            map.remove(key);
                    }
                }
            }
            if(map.isEmpty())
                sb.append("EMPTY").append("\n");
            else
                sb.append(map.lastKey()).append(" ").append(map.firstKey()).append("\n");
        }
        System.out.println(sb);
    }
}