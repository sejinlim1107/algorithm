import java.io.*;

public class Main1110 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int origin = Integer.parseInt(br.readLine());
        int cycle = 0;
        int newNum = origin;

        while(true){
            newNum = newNum%10*10 + ((newNum/10 +newNum%10)%10);
            cycle++;

            if(origin == newNum)
                break;
        }
        System.out.println(cycle);

        /*
        String newNum = origin;

        while(true){
            if(newNum.length()==1) {
                cycle++;
                newNum = newNum+newNum;
                if(newNum.charAt(0) == '0')
                    newNum = Character.toString(newNum.charAt(1));
            }
            else{
                cycle++;
                newNum = Character.toString(newNum.charAt(1))+Integer.toString((newNum.charAt(0)-'0'+newNum.charAt(1)-'0')%10);
                if(newNum.charAt(0) == '0')
                    newNum = Character.toString(newNum.charAt(1));
            }
            if(origin.equals(newNum))
                break;
        }
        System.out.println(cycle);
        */
    }
}
