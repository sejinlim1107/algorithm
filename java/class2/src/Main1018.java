import java.io.*;
import java.util.*;

public class Main1018 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        char[][] board = new char[n][m];
        int min = 32;

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
                    for(int l=j;l<j+8;l=l+2){
                        if(k%2==0){ //첫번째 줄, 세번째 줄 ...
                            if(board[k][l]=='W')
                                tmp1++;
                            else
                                tmp2++;
                            if(board[k][l+1]=='B')
                                tmp1++;
                            else
                                tmp2++;
                        }
                        else{
                            if(board[k][l]=='B')
                                tmp1++;
                            else
                                tmp2++;
                            if(board[k][l+1]=='W')
                                tmp1++;
                            else
                                tmp2++;
                        }
                    }
                }
                min = Math.min(min, Math.min(tmp1, tmp2));
            }
        }
        System.out.println(min);
    }
}