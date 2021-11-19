import java.util.*;
import java.io.*;

public class Main15312 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] num = {3, 2, 1, 2, 3, 3, 2, 3, 3, 2, 2, 1, 2, 2, 1, 2, 2, 2, 1, 2, 1, 1, 1, 2, 2, 1};
        String a = br.readLine();
        String b = br.readLine();
        int size = a.length()*2;
        int[][] goong = new int[size][size];

        for(int i=0;i<goong.length;i+=2){
            int n1 = a.charAt(i/2)-'A';
            int n2 = b.charAt(i/2)-'A';
            goong[0][i] = num[n1];
            goong[0][i+1] = num[n2];
        }

        for(int i=1;i<goong.length;i++){
            for(int j=0;j<goong.length-1;j++){
                goong[i][j] = (goong[i-1][j]+goong[i-1][j+1])%10;
            }
        }
        System.out.println(goong[size-2][0]+""+goong[size-2][1]);
    }
}
