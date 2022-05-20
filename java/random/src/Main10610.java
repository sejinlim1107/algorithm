import java.io.*;
import java.util.*;

public class Main10610 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String s = br.readLine();
        int[] num = new int[10]; // 0~9
        int sum = 0; // 3의 배수 확인용 (각 자리 다 더해서 3의 배수면 3의 배수임)
        for(int i=0;i<s.length();i++){
            int tmp = s.charAt(i)-'0';
            num[tmp]++;
            sum += tmp;
        }
        if(num[0]>0 && sum % 3 == 0){
            for(int i=9;i>=0;i--){
                if(num[i]>0){
                    for(int j=0;j<num[i];j++)
                        sb.append(i);
                }
            }
            System.out.println(sb);
        }
        else
            System.out.println(-1);
    }
    /*
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] arr = br.readLine().toCharArray();
        boolean flag = false; // 0이 있는지 확인 (10의 배수 확인용)
        int sum = 0; // 3의 배수 확인용 (각 자리 다 더해서 3의 배수면 3의 배수임)
        for(int i=0;i<arr.length;i++){
            int tmp = arr[i]-'0';
            sum += tmp;
            if(tmp == 0)
                flag = true;
        }
        if(flag && sum % 3 == 0){
            Arrays.sort(arr);
            for(int i=arr.length-1;i>=0;i--)
                System.out.print(arr[i]);
        }
        else
            System.out.println(-1);
    }
    */
}