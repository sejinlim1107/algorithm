import java.util.*;
import java.io.*;
import java.util.Map.*;

public class Main1931 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        HashMap<Integer,Integer> map1 = new HashMap<>();
        HashMap<Integer,Integer> map2 = new HashMap<>(); // 시간차
        int answer = 0;
        int n = Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++){
            st  = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            map1.put(a,b);
            map2.put(a,b-a);
        }
        Object[] keys = map1.keySet().toArray();
        Arrays.sort(keys);
        List<Entry<Integer, Integer>> list = new ArrayList<Entry<Integer, Integer>>(map2.entrySet());
        Collections.sort(list, new Comparator<Entry<Integer, Integer>>() {
            public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
                // 오름차순 정렬
                return o1.getValue().compareTo(o2.getValue());
            }
        });

        for(Integer key : map1.keySet()){
            System.out.println(key+" "+map1.get(key));

        }

        for(Entry<Integer, Integer> entry : list) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
