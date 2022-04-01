import java.io.*;

public class Main5613 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int answer = Integer.parseInt(br.readLine());
        while(true){
            String op = br.readLine();
            if(op.equals("=")){
                System.out.println(answer);
                return;
            }
            int b = Integer.parseInt(br.readLine());
            if(op.equals("+"))
                answer+=b;
            else if(op.equals("-"))
                answer-=b;
            else if(op.equals("*"))
                answer*=b;
            else if(op.equals("/"))
                answer/=b;
        }
    }
}