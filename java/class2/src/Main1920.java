import java.util.*;
import java.io.*;

public class Main1920 {
    /*
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        Set<Integer> set = new HashSet<>();
        st = new StringTokenizer(br.readLine());

        for(int i=0;i<N;i++){
            set.add(Integer.parseInt(st.nextToken()));
        }

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        for(int i=0;i<M;i++){
            if(set.contains(Integer.parseInt(st.nextToken())))
                sb.append("1\n");
            else
                sb.append("0\n");

        }

        System.out.println(sb);
    }
         */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int [] a = new int[N];

        st = new StringTokenizer(br.readLine());

        for(int i=0;i<N;i++){
            a[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(a);

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        for(int i=0;i<M;i++){
            if(Arrays.binarySearch(a,Integer.parseInt(st.nextToken())) >= 0)
                sb.append(1).append("\n");
            else
                sb.append(0).append("\n");
        }

        System.out.println(sb);
    }
}

