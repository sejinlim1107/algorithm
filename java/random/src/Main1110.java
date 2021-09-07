import java.io.*;

public class Main1110 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String num = br.readLine();
        //int N = Integer.parseInt(numS);
        int cycle = 1;
        String newNum = num;
        //int newNum = (N<10)?N:(numS.charAt(0)+numS.charAt(1))-'0';

        while(num.equals(newNum)){
            if(newNum.length()==1) {
                cycle++;
                newNum = newNum+newNum;
            }
            else{
                cycle++;
                newNum = Character.toString(newNum.charAt(1))+Character.toString(newNum.charAt(0)+newNum.charAt(1)-'0');
            }
        }

        System.out.println(cycle);
    }
}
