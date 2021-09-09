import java.io.*;
import java.util.*;

public class Main15596 { //백준에 제출 시 Test로 클래스명 변경할 것
    long sum(int[] a){
        long ans = 0;
        for(int i=0;i<a.length;i++){
            ans += a[i];
        }
        return ans;
    }
}
