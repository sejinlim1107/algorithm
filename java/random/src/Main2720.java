import java.io.*;

public class Main2720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        int[] arr = {25, 10, 5, 1};
        while(t-->0){
            int don = Integer.parseInt(br.readLine());
            for(int i=0;i<4;i++){
                sb.append(don/arr[i]).append(" ");
                don %= arr[i];
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}