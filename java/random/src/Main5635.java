import java.util.*;
import java.io.*;

public class Main5635 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        String[][] s = new String[n][4];

        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<4;j++){
                s[i][j] = st.nextToken();
            }
        }

        Arrays.sort(s, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                if(o1[3].equals(o2[3])){
                    if(o1[2].equals(o2[2])){
                        return Integer.parseInt(o1[1])-Integer.parseInt(o2[1]);
                    }
                    return Integer.parseInt(o1[2])-Integer.parseInt(o2[2]);
                }
                return Integer.parseInt(o1[3])-Integer.parseInt(o2[3]);
            }
        });

        System.out.println(s[n-1][0]);
        System.out.println(s[0][0]);
    }
}