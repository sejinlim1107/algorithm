import java.util.*;
import java.io.*;

public class Main1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        s = s.toUpperCase();
        int[] al = new int[26];

        for(int i=0;i<s.length();i++){
            al[s.charAt(i)-65]++;
        }

        int max = -1;
        int ch = -2;

        for(int i=0;i<26;i++){
            if(max < al[i]){
                max = al[i];
                ch = i;
            }
            else if(max == al[i]){
                ch = -2;
            }
        }

        System.out.println((char)(ch+65));

        /*
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)+1);
        }

        int max = -1;
        char key = '0';
        char max_key = '0';
        boolean only = true;

        Iterator iter = map.keySet().iterator();
        while(iter.hasNext()){
            key = (char)iter.next();
            int value = map.get(key);
            if(max < value){
                max = value;
                max_key = key;
                only = true;
            }
            else if(max == value){
                only = false;
            }
        }

        if(!only)
            System.out.println("?");
        else
            System.out.println(max_key);
         */
    }
}
