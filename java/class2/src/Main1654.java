import java.util.*;
import java.io.*;

public class Main1654 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int k = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken()); //필요한 랜선 수
        int[] num = new int[k];
        long min = 0;
        long max = 0;
        long mid = 0;

        for(int i=0;i<k;i++){
            num[i] = Integer.parseInt(br.readLine());
            if(num[i]>max)
                max = num[i];
        }

        max++;

        while(min < max){
            mid = (min+max)/2;
            long cnt = 0;
            for(int i=0;i<k;i++){
                cnt += (num[i]/mid);
            }
            if(cnt < n){ //길이가 길다. 줄여줘야함
                max = mid;
            }
            else{
                min = mid+1;
            }
        }
        System.out.println(min-1);
    }
}
