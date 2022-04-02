import java.io.*;
import java.util.*;

public class Main11403 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int[][] mat = new int[n][n];
        for (int i = 0; i < n; i++) { // 입력받아서 넣기
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                mat[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for (int k = 0; k < n; k++) { // 거쳐갈 아이 설정
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (mat[i][k] == 1 && mat[k][j] == 1) {
                        mat[i][j] = 1;
                    }
                }
            }
        }
        for(int i=0;i<n;i++) {
            for (int j = 0; j < n; j++) {
                sb.append(mat[i][j]).append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}