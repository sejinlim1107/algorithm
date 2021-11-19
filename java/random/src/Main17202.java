import java.util.*;
import java.io.*;

public class Main17202 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] p1 = br.readLine().split("");
        String[] p2 = br.readLine().split("");
        String[][] newP = new String[16][16];

        for(int i=0;i<newP.length;i+=2){
            newP[0][i] = p1[i/2];
            newP[0][i+1] = p2[i/2];
        }


        for(int i=1;i<newP.length-1;i++){
            for(int j=0;j<newP.length-i;j++){
                int a = Integer.parseInt(newP[i-1][j]);
                int b = Integer.parseInt(newP[i-1][j+1]);
                newP[i][j] = Integer.toString((a+b)%10);
                //System.out.print(newP[i][j]+" ");
            }
            //System.out.println();
        }

        System.out.println(newP[14][0]+newP[14][1]);
    }
}
