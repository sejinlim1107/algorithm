import java.io.*;

public class Main14581 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String name = br.readLine();
        sb.append(":fan::fan::fan:\n").append(":fan::").append(name).append("::fan:\n").append(":fan::fan::fan:\n");
        System.out.println(sb);
        /*
        name = ":"+name+":";
        String fan = ":fan:";
        for(int i=0;i<9;i++){
            if(i==4)
                sb.append(name);
            else
                sb.append(fan);
            if(i%3==2)
                sb.append("\n");
        }
        System.out.println(sb);
         */
    }
}