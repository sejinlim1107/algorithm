import java.io.*;

public class Main5597 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean student[] = new boolean[31];
        for(int i=0;i<28;i++){
            student[Integer.parseInt(br.readLine())] = true;
        }
        for(int i=1;i<31;i++){
            if(!student[i])
                System.out.println(i);
        }
    }
}