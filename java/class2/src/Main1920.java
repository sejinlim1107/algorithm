import java.util.*;
import java.io.*;

public class Main1920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        HashSet<String> set = new HashSet<String>();
        st = new StringTokenizer(br.readLine());

        for(int i=0;i<N;i++){
            a[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(a);

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        for(int i=0;i<M;i++){
            sb.append(binary_search(a,Integer.parseInt(st.nextToken()))).append("\n");
        }

        System.out.println(sb);
    }
    /*
    public static int binary_search(int[] a, int target){
        int start = 0;
        int end = a.length-1;

        while(start <= end){
            int mid = (int)(start+end)/2;

            if(a[mid] == target)
                return 1;
            else if(a[mid] < target)
                start = mid+1;
            else
                end = mid-1;

        }
        return 0;
    }

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
            sb.append(binary_search(a,Integer.parseInt(st.nextToken()))).append("\n");
        }

        System.out.println(sb);
    }
     */
}

