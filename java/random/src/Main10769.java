import java.io.*;

public class Main10769 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int happy = 0;
        int sad = 0;
        for(int i=0;i<s.length()-2;i++){
            if(s.charAt(i)==':' && s.charAt(i+1)=='-'){
                if(s.charAt(i+2)==')'){
                    happy++;
                    i+=2;
                }
                else if(s.charAt(i+2)=='('){
                    sad++;
                    i+=2;
                }
            }
        }
        if(sad==0 && happy==0)
            System.out.println("none");
        else if(happy == sad)
            System.out.println("unsure");
        else if(happy > sad)
            System.out.println("happy");
        else
            System.out.println("sad");
    }
}