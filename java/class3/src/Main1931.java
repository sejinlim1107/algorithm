import java.util.*;
import java.io.*;
import java.util.Map.*;

public class Main1931 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        int time[][] = new int[n][2];
        int answer = 0;
        for(int i=0;i<n;i++){
            st  = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            time[i][0] = a;
            time[i][1] = b;
        }
        Arrays.sort(time, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[1] == o2[1])
                    return o1[0]-o2[0];
                return o1[1]-o2[1];
            }
        });
        int last = -1;
        for(int i=0;i<n;i++) {
            int start = time[i][0];
            int end = time[i][1];
            if(start >= last){
                last = end;
                answer++;
            }
        }
        System.out.println(answer);
    }
}