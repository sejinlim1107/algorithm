import java.util.*;
import java.io.*;

public class Main2805 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int [] tree = new int[n];
        st = new StringTokenizer(br.readLine());
        int max = 0;

        for(int i=0;i<n;i++){
            tree[i] = Integer.parseInt(st.nextToken());
            if(tree[i] > max) max = tree[i];
        }

        int min = 0;
        int mid = 0;

        while(min < max){
            long sum = 0;
            mid = min+(max-min)/2; //overflow 방지
            for(int i=0;i<n;i++){
                int tmp = tree[i]-mid;
                if(tmp > 0)
                    sum+=tmp;
            }
            if(sum < m) { // 나무를 더 길게 잘라야 함. 즉 톱날 높이 줄여야함
                max = mid;
            }
            else {
                min = mid + 1;
            }
        }
        System.out.println(min-1); //upper bound로 풀었기 때문에 -1 해줌
    }
}