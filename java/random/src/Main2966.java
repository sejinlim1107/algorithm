import java.io.*;

public class Main2966 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String names[] = {"Adrian","Bruno","Goran"};
        String answers[] = {"ABC","BABC","CCAABB"};
        int scores[] = new int[3];
        int n = Integer.parseInt(br.readLine());
        int max = 0;
        String answer = br.readLine();
        for(int i=0;i<3;i++){
            int len = answers[i].length();
            for(int j=0;j<n;j++){
                if(answer.charAt(j)==answers[i].charAt(j%len))
                    scores[i]++;
            }
            if(max < scores[i])
                max = scores[i];
        }
        System.out.println(max);
        for(int i=0;i<3;i++) {
            if(scores[i] == max)
                System.out.println(names[i]);
        }
    }
}