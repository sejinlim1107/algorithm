import java.util.*;
import java.io.*;

public class Main2742 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());

        for(int i=N; i>0; i--) {
            System.out.println(i);
        }
    }
}
