import java.util.*;
import java.io.*;

public class Main2164 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Deque<Integer> deque = new LinkedList<>();
        int n = Integer.parseInt(br.readLine());

        for(int i=1;i<=n;i++){
            deque.add(i);
        }

        while(deque.size()!=1){
            deque.remove();
            deque.addLast(deque.pollFirst());
        }

        System.out.println(deque.getFirst());
    }
}
