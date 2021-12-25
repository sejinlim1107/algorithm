import java.io.*;
import java.util.*;

public class Main1018 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        char[][] board = new char[n][m];
        int min = 400;

        //배열에 넣기
        for(int i=0;i<n;i++) {
            String s = br.readLine();
            for (int j = 0; j < m; j++) {
                board[i][j] = s.charAt(j);
            }
        }

        for(int i=0;i<n-7;i++){
            for(int j=0;j<m-7;j++){
                int tmp1 = 0;
                int tmp2 = 0;
                for(int k=i;k<i+8;k++){
                    for(int l=j;l<j+8;l++){
                        if(k%2==0 && board[k][l]=='W'){ //첫번째 줄, 세번째 줄 ...

                        }
                    }
                }
            }
        }

    }
}
