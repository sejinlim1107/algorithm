import java.io.*;

public class Main10101 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        int sum = a+b+c;
        if(sum==180){
            if(a == b && a == c)
                System.out.println("Equilateral");
            else if(a == c || b == c || a == b)
                System.out.println("Isosceles");
            else
                System.out.println("Scalene");
        }
        else
            System.out.println("Error");
    }
}
