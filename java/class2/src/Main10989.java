import java.util.*;
import java.io.*;

public class Main10989 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int [] num = new int[10001];
        int max = -1;
        int tmp;

        for(int i=0;i<N;i++){
            tmp = Integer.parseInt(br.readLine());
            num[tmp]++;
            if(tmp > max)
                max = tmp;
        }

        for(int i=0;i<=max;i++){
            if(num[i]!=0){
                for(int j=0;j<num[i];j++)
                    sb.append(i+"\n");
            }
        }
        System.out.println(sb);
    }
}


/*
import java.util.*;
import java.io.*;

public class Main10989 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        int tmp;

        for(int i=0;i<N;i++){
            tmp = Integer.parseInt(br.readLine());
            map.put(tmp, map.getOrDefault(tmp,0)+1);
        }

        for(Integer i : map.keySet()){
            for(int j=0;j<map.get(i);j++){
                sb.append(i+"\n");
            }
        }
        System.out.println(sb);
    }
}
 */