import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String s = br.readLine();
        int[] al = new int[26];
        Arrays.fill(al, -1);

        /*
        for(int i=0;i<s.length();i++){
            if(al[s.charAt(i)-'a'] == -1)
                al[s.charAt(i)-'a'] = i;
        }
        */
        //뒤에서부터 찾으면 마지막에 갱신된 위치가 처음 발견된 위치임
        for(int i=s.length()-1;i>=0;i--){
            al[s.charAt(i)-'a'] = i;
        }


        for(int i : al){
            sb.append(i+" ");
        }

        System.out.print(sb);
    }
}
