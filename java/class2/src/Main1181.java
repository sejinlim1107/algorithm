import java.util.*;
import java.io.*;

public class Main1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        String[] s = new String[N];

        for(int i=0;i<N;i++){
            s[i] = br.readLine();
        }

        Arrays.sort(s, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length() == o2.length())
                    return o1.compareTo(o2);
                else
                    return o1.length()-o2.length();
            }
        });

        sb.append(s[0]).append("\n");
        for(int i=1;i<s.length;i++){
            if(s[i].equals(s[i-1]))
                continue;
            sb.append(s[i]).append("\n");
        }

        System.out.println(sb);

        /*
        HashSet<String> set = new HashSet<String>();

        for(int i=0;i<N;i++){
            set.add(br.readLine());
        }

        ArrayList<String> al = new ArrayList(set);

        Collections.sort(al, new Comparator<String>(){
            @Override
            public int compare(String o1, String o2){
                if(o1.length() == o2.length())
                    return o1.compareTo(o2);
                else if(o1.length() > o2.length())
                    return 1;
                else
                    return -1;
            }
        });

        for(int i=0;i<al.size();i++){
            sb.append(al.get(i)).append("\n");
        }
        System.out.println(sb);
        */
    }
}

