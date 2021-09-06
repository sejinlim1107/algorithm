import java.io.*;

public class Main1110 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String numS = br.readLine();
        int N = Integer.parseInt(numS);
        int cycle = 1;
        int newNum = (N<10)?N:(numS.charAt(0)+numS.charAt(1))-'0';

        while(N != newNum){
            if(N<10){
                newNum = numS.charAt(0)-'0';
            }
            newNum = numS.charAt(0)+numS.charAt(1)
        }
    }
}
