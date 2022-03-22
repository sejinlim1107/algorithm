import java.io.*;
import java.util.*;

public class Main2309 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] tall = new int[9];
        int sum = 0;
        int p1, p2;
        for(int i=0;i<9;i++){
            tall[i] = Integer.parseInt(br.readLine());
            sum+=tall[i];
        }
        Arrays.sort(tall);
        for(int i=0;i<9;i++){
            p1 = tall[i];
            for(int j=i+1;j<9;j++){
                p2 = tall[j];
                if(sum-p1-p2 == 100){
                    for(int k=0;k<9;k++){
                        if(k==i || k==j)
                            continue;
                        sb.append(tall[k]).append("\n");
                    }
                    System.out.println(sb);
                    return;
                }
            }
        }
    }
}