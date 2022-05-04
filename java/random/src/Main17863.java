import java.io.*;

public class Main17863 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        if(br.readLine().substring(0,3).equals("555"))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}