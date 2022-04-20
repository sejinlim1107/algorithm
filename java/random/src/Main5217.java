import java.io.*;

public class Main5217 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        while(t-->0){
            int n = Integer.parseInt(br.readLine());
            boolean flag = false;
            sb.append("Pairs for ").append(n).append(": ");
            for(int i=1;i<11;i++){
                for(int j=i+1;j<12;j++){
                    if(i+j == n){
                        if(flag)
                            sb.append(", ");
                        sb.append(i).append(" ").append(j);
                        flag = true;
                    }
                }
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}