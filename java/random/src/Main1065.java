import java.io.*;

public class Main1065 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        if(n<100){
            System.out.println(n);
            return;
        }
        int answer = 99;
        for(int i=111;i<=n;i++){
            String tmp = Integer.toString(i);
            int d = tmp.charAt(0)-tmp.charAt(1);
            boolean flag = true;
            for(int j=1;j<tmp.length()-1;j++){
                if(d != tmp.charAt(j)-tmp.charAt(j+1)) {
                    flag = false;
                    break;
                }
            }
            if(flag)
                answer++;
        }
        System.out.println(answer);
    }
}
