import java.util.*;
import java.io.*;

public class Main2108 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[8001]; //-4000~4000. index 0 = -4000
        double sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int median = 0; //중앙값
        int mode = 0; //최빈값

        for(int i=0;i<N;i++){
            int v = Integer.parseInt(br.readLine());
            sum += v;
            arr[v+4000]++; //최빈값 찾기

            if(max < v)
                max = v;
            if(min > v)
                min = v;
        }

        int cnt = 0;
        int mode_max = 0; //빈도수 최댓값
        boolean flag = false; //2번째 최빈값 찾으려고

        for(int i=min+4000; i<=max+4000; i++){ //counting sort하려고
            if(arr[i] > 0){
                if(cnt < (N+1) / 2) { //천잰가,, 진짜 소름,, 중앙값은 가운데 인덱스니까..
                    cnt += arr[i]; //숫자 개수 세기. 곧 인덱스를 세는 것임
                    median = i - 4000;
                }

                if(mode_max < arr[i]){
                    mode_max = arr[i];
                    mode = i-4000;
                    flag = true;
                }
                else if(flag && mode_max == arr[i]){
                    mode = i-4000;
                    flag = false;
                }
            }
        }

        sb.append(Math.round(sum/N)).append("\n");
        sb.append(median).append("\n"); //중앙값
        sb.append(mode).append("\n"); //최빈값
        sb.append(max - min).append("\n");

        System.out.println(sb);

        /*
        int[] choi = new int[8001];
        int num[] = new int[N];
        double avg = 0;
        int max=0;
        int cnt=0;
        int cVal=0;

        for(int i=0;i<N;i++) {
            num[i] = Integer.parseInt(br.readLine());
            avg += num[i];
            choi[num[i]+4000]++;
        }

        for(int i=0;i<choi.length;i++){ //빈도 수 최댓값 구하기
            if(choi[i] > max){
                max = choi[i];
            }
        }

        for(int i=0;i<choi.length;i++){
            if(cnt==2) break;
            if(choi[i] == max) {
                cnt++;
                cVal = i-4000;
            }
        }

        Arrays.sort(num);
        sb.append(Math.round(avg/N)).append("\n");
        sb.append(num[(int)Math.floor(N/2)]).append("\n");
        sb.append(cVal).append("\n");
        sb.append(num[N-1]-num[0]).append("\n");

        System.out.println(sb);

         */
    }
}
