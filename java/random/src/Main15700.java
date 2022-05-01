import java.io.*;
import java.util.*;

public class Main15700 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long total = Long.parseLong(st.nextToken()) * Long.parseLong(st.nextToken()); // 전체 타일 크기
        System.out.println(total/2);
    }
}