import java.io.*;
import java.util.*;

public class Main2309 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] tall = new int[9];
        for(int i=0;i<9;i++){
            tall[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(tall);
        int sum = 0;
        for(int i=0;i<7;i++){
            if(sum>100)
                continue;
            sum+=tall[i];
        }
    }
}
