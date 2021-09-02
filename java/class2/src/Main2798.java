import java.util.*;
import java.io.*;

public class Main2798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int [] card = new int[N];
        int sum=0;
        int cmp=0;

        st = new StringTokenizer(br.readLine());

        for(int i=0;i<N;i++){
            card[i] = Integer.parseInt(st.nextToken());
        }

        for(int i=0;i<N-2;i++){
            for(int j=i+1;j<N-1;j++){
                for(int z=j+1;z<N;z++){
                    cmp = card[i]+card[j]+card[z];
                    if(cmp == M){
                        System.out.println(cmp);
                        return;
                    }
                    else if(cmp < M && cmp > sum)
                        sum = cmp;
                }
            }
        }
        System.out.println(sum);
    }
}

