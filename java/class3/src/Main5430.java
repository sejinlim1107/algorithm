import java.util.*;
import java.io.*;

public class Main5430 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        while(t-->0){
            String f = br.readLine(); // 함수
            int n = Integer.parseInt(br.readLine());
            boolean mode = true; // true면 앞에서부터, false면 뒤에서부터
            boolean error = false;
            String arr = br.readLine();
            Deque<String> deque = new LinkedList<>();
            arr = arr.substring(1,arr.length()-1); // [] 뺀 문자열
            String[] num = arr.split(",");
            for(int i=0;i<n;i++){
                deque.add(num[i]);
            }
            for(int i=0;i<f.length();i++){
                if(f.charAt(i)=='R'){
                    mode = !mode;
                }
                else{ // 'D'
                    if(!deque.isEmpty()) {
                        if (mode) {
                            deque.pollFirst();
                        }
                        else{
                            deque.pollLast();
                        }
                    }
                    else {
                        error = true;
                        break;
                    }
                }
            }
            if(error)
                sb.append("error").append("\n");
            else if(deque.size()==0)
                sb.append("[]").append("\n");
            else{
                sb.append("[");
                if(mode) {
                    for (Iterator<String> it = deque.iterator(); it.hasNext();) {
                        sb.append(it.next() + ",");
                    }
                }
                else{
                    for (Iterator<String> it = deque.descendingIterator(); it.hasNext();) {
                        sb.append(it.next() + ",");
                    }
                }
                sb.deleteCharAt(sb.length()-1); // , 없애기
                sb.append("]").append("\n");
            }
        }
        System.out.println(sb);
    }
}