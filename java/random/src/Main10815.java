import java.util.*;
import java.io.*;

public class Main10815 {
    public static int[] sang;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        sang = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++)
            sang[i] = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(br.readLine());
        int[] num = new int[m];
        Arrays.sort(sang);
        Arrays.sort(num);
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<m;i++)
            num[i] = Integer.parseInt(st.nextToken());
        for(int i=0;i<m;i++){
            sb.append(bs(0,sang.length-1,num[i])).append(" ");
        }
        System.out.println(sb);
    }

    public static int bs(int s, int e, int k){
        if(s<=e){
            int idx = (s+e)/2;
            if(sang[idx] < k){ // 오른쪽으로 가기
                s = idx+1;
            }
            else if(sang[idx] > k){ // 왼쪽으로 가기
                e = idx-1;
            }
            else{
                return 1;
            }
            return bs(s,e,k);
        }
        else
            return 0;
    }
}