import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main2920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int first = Integer.parseInt(st.nextToken());

        if(first==8){
            for(int i=1;i<8;i++){
                if(Integer.parseInt(st.nextToken()) != 8-i) {
                    System.out.println("mixed");
                    return;
                }
            }
            System.out.println("descending");
        }
        else{
            for(int i=1;i<8;i++){
                if(first != 1 || Integer.parseInt(st.nextToken()) != i+1){
                    System.out.println("mixed");
                    return;
                }
            }
            System.out.println("ascending");
        }
    }
}
