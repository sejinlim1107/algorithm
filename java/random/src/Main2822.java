import java.io.*;
import java.util.*;

public class Main2822 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] origin = new int[8];
        int[] sorted = new int[8];
        int score = 0;
        for(int i=0;i<8;i++){
            origin[i] = Integer.parseInt(br.readLine());
            sorted[i] = origin[i];
        }
        Arrays.sort(sorted); // 오름차순 정렬 0,1,2,3,4,5,6,7
        int mid = sorted[3]; // idx = 3일 때 자기 자신 포함 뒤에 5개임
        for(int i=0;i<8;i++){
            if(origin[i]>=mid) {
                score += origin[i];
                sb.append(i+1).append(" ");
            }
        }
        System.out.println(score);
        System.out.println(sb);
    }
    /*
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<Integer,Integer> map = new HashMap<>(); // 점수, 문제번호
        StringBuilder sb = new StringBuilder();
        int[] idx = new int[5];
        int score = 0;
        for(int i=0;i<8;i++){
            map.put(Integer.parseInt(br.readLine()),i+1);
        }
        Object[] keys = map.keySet().toArray();
        Arrays.sort(keys, Collections.reverseOrder()); // 내림차순으로 key 정렬
        for(int i=0;i<5;i++){
            score += (int)keys[i];
            idx[i] = map.get(keys[i]);
        }
        Arrays.sort(idx);
        sb.append(score).append("\n");
        for(int i=0;i<5;i++)
            sb.append(idx[i]).append(" ");
        System.out.println(sb);
    }
    */
}