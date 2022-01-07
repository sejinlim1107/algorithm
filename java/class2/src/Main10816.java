import java.util.*;
import java.io.*;

public class Main10816 {
    // 이진탐색
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int[] num = new int[n];
        st = new StringTokenizer(br.readLine());

        for(int i=0;i<n;i++){
            num[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(num);

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        while(m-->0){
            int tmp = Integer.parseInt(st.nextToken());
            sb.append(upperBound(num, tmp)-lowerBound(num, tmp)).append(" ");
        }
        System.out.println(sb);
    }

    public static int lowerBound(int[] num, int k){
        int min = 0;
        int max = num.length;

        while(min < max){
            int mid = (min+max)/2;
            if(num[mid] >= k)
                max = mid;
            else
                min = mid+1;
        }
        return min;
    }

    public static int upperBound(int[] num, int k){
        int min = 0;
        int max = num.length;

        while(min < max){
            int mid = (min+max)/2;
            if(num[mid] > k)
                max = mid;
            else
                min = mid+1;
        }
        return min;
    }

    /* 카운팅 정렬 이용
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int[] num = new int[20000001];

        int len = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        while(len-->0){
            num[Integer.parseInt(st.nextToken())+10000000]++;
        }

        len = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        while(len-->0){
            sb.append(num[Integer.parseInt(st.nextToken())+10000000]).append(" ");
        }
        System.out.println(sb);
    }
     */

    /* 맵 이용
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        for(int i=0;i<n;i++){
            int a = Integer.parseInt(st.nextToken());
            map.put(a, map.getOrDefault(a, 0)+1);
        }

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        for(int i=0;i<m;i++){
            int a = Integer.parseInt(st.nextToken());
            sb.append(map.getOrDefault(a, 0)).append(" ");
        }

        System.out.println(sb);
    }
     */
}
