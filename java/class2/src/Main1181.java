import java.util.*;
import java.io.*;
import java.util.Map.Entry;

public class Main1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        ArrayList<ArrayList<String>> sen = new ArrayList<ArrayList<String>>();

        for(int i=0;i<N;i++){
            ArrayList<String> s = new ArrayList<>();
        }

        /*
        Map<String, Integer> map = new HashMap<String, Integer>();

        for(int i=0;i<N;i++){
            String s = br.readLine();
            map.put(s, s.length());
        }

        List<Entry<String, Integer>> list = new ArrayList<Entry<String, Integer>>(map.entrySet());
        Collections.sort(list, new Comparator<Entry<String, Integer>>() {
            @Override
            public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });

        //Object[] keys = map.keySet().toArray(new String[0]);
        //Arrays.sort(keys);
         */

    }
}

