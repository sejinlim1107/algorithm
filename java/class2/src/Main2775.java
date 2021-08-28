import java.util.*;
import java.io.*;

public class Main2775 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        int num = 0;
        int tmp = 0;

        for(int i=0;i<T;i++){
            st = new StringTokenizer(br.readLine());
            int k = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());

            for(int j=0;j<=k;j++){
                for(int z=1;z<=n;z++){
                    if(j==0)
                        num+=z;
                    else {
                        //tmp += num+
                        //num+=tmp;
                    }
                }
            }
        }


    }
}
