import java.util.*;
import java.io.*;

public class Main11650 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][2];

        StringBuilder sb = new StringBuilder();

        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr, (o1, o2) -> {
            if(o1[0] == o2[0]){
                return Integer.compare(o1[1], o2[1]);
            }
            else {
                return Integer.compare(o1[0],o2[0]);
            }
        });

        for(int i=0;i<N;i++){
            sb.append(arr[i][0]+" "+arr[i][1]+"\n");
        }

        System.out.println(sb);
    }
}