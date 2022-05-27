import java.io.*;

public class Main11586 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        String[] mirror = new String[n];
        for(int i=0;i<n;i++)
            mirror[i] = br.readLine();
        int option = Integer.parseInt(br.readLine());
        if(option==1){
            for(int i=0;i<n;i++)
                sb.append(mirror[i]).append("\n");
        }
        else if(option==2){
            for(int i=0;i<n;i++){
                for(int j=n-1;j>=0;j--){
                    sb.append(mirror[i].charAt(j));
                }
                sb.append("\n");
            }
        }
        else {
            for(int i=0;i<n;i++){
                sb.append(mirror[n-i-1]).append("\n");
            }
        }
        System.out.println(sb);
    }
}