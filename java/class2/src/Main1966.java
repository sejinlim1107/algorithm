import java.io.*;
import java.util.*;

public class Main1966 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<int[]> queue = new LinkedList<>(); //인덱스, 중요도
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int test = Integer.parseInt(br.readLine());
        for(int i=0;i<test;i++){
            st = new StringTokenizer(br.readLine());
            int size = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            int[] sorted = new int[size];

            for(int j=0;j<size;j++) {
                int tmp = Integer.parseInt(st.nextToken()); //중요도
                queue.add(new int[] {j, tmp});
                sorted[j] = tmp;
            }
            Arrays.sort(sorted);
            int order = size-1; //sorted 정렬 뒤에부터 (내림차순)
            int cnt = 0;
            while(!queue.isEmpty()){
                int[] check = queue.poll();
                int index = check[0];
                int importance = check[1];

                if(sorted[order] != importance){
                    //System.out.println("else if");
                    queue.add(check);
                }
                else if(index == m) {
                    //System.out.println("if");
                    cnt++;
                    break;
                }
                else{
                    //System.out.println("else");
                    order--;
                    cnt++;
                }
            }
            //System.out.println("sb "+cnt);
            sb.append(cnt).append("\n");
            queue.clear();
        }
        System.out.println(sb);
    }
}
