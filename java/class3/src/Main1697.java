import java.util.*;
import java.io.*;

public class Main1697 {
    public static int spot[];
    public static int bro;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int subin = Integer.parseInt(st.nextToken());
        bro = Integer.parseInt(st.nextToken());
        spot = new int[200001];
        Arrays.fill(spot,-1);
        spot[subin] = 0;
        if(subin >= bro){ // 동생이 수빈이보다 뒤에 있거나 같은 위치에 있을 때
            System.out.println(subin-bro);
            return;
        }
        bfs(subin);
        System.out.println(spot[bro]);
    }
    public static void bfs(int n){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(n);

        while(!queue.isEmpty()){
            int tmp = queue.poll();
            if(tmp<0)
                continue;
            if(tmp == bro)
                break;
            if(tmp-1>=0 && spot[tmp-1]==-1) {
                queue.add(tmp-1);
                spot[tmp-1] = spot[tmp]+1;
            }
            if(tmp<=bro) { // 이미 동생을 뛰어넘었으면 위치를 줄이는 것만 해야하니까
                if (spot[tmp+1]==-1) {
                    queue.add(tmp+1);
                    spot[tmp+1] = spot[tmp]+1;
                }
                if (spot[tmp*2]==-1) {
                    queue.add(tmp*2);
                    spot[tmp*2] = spot[tmp]+1;
                }
            }
        }
    }
}