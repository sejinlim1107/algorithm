import java.util.*;
import java.io.*;

public class Main1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        s = s.toUpperCase();
        String[] arr = s.split("");

        HashSet<String> set = new HashSet<>(Arrays.asList(arr));
        arr = set.toArray(new String[0]);

        int[] num = new int[arr.length];

        for(int i=0;i<num.length;i++){
            num[i] = 0;
        }

        for(int i=0;i<s.length();i++){
            for(int j=0;j<arr.length;j++){
                if(arr[j].equals(Character.toString(s.charAt(i)))){
                    num[j]++;
                }
            }
        }

        int max = -1;
        int index = -1;
        int tmp = -1;

        for(int i=0;i<num.length;i++){
            if(num[i]>max) {
                max = num[i];
                index= i;
            }
            else if(num[i] == max)
                tmp = num[i];
        }

        if(tmp == max){
            System.out.println("?");
        }
        else
            System.out.println(arr[index]);
    }
}
