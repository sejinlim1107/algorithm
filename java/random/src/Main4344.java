import java.io.*;
import java.util.StringTokenizer;

public class Main4344 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int C = Integer.parseInt(br.readLine());

        for(int i=0;i<C;i++){
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int[] scores = new int[N];
            double avg = 0;
            for(int j=0;j<N;j++){
                scores[j] = Integer.parseInt(st.nextToken());
                avg += scores[j];
            }
            avg /= N;
            double num = 0;

            for(int j=0;j<N;j++){
                if(avg<scores[j])
                    num++;
            }
            sb.append(String.format("%.3f",(num/N)*100)).append("%\n");
        }

        System.out.println(sb);
    }
}
