import java.util.*;
import java.io.*;
public class Main11659 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] arr = new int[N + 1]; // 시작 1부터 할거임

        for (int i = 1; i < N + 1; i++) {
            arr[i] = arr[i - 1] + Integer.parseInt(st.nextToken()); // 누적합 저장
        }

        while (M-->0) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            sb.append(arr[j] - arr[i-1]).append("\n");
        }

        System.out.println(sb);
    }
}