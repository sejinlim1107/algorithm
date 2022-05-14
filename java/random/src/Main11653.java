import java.io.*;

public class Main11653 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        for(int i=2;i<=Math.sqrt(n);i++){ // 작은 소수부터 나눠주기 때문에 4,6 같은 수는 (n%i!=0)이 돼서 걸러짐
            if(n==1)
                break;
            else{
                while(n%i==0){
                    n/=i;
                    sb.append(i).append("\n");
                }
            }
        }
        if(n!=1) sb.append(n); // 입력된 값이 큰 소수 자체일 경우
        System.out.println(sb);
    }
    /*
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        boolean[] isPrime = new boolean[n+1];
        int[] primes = new int[n];
        Arrays.fill(isPrime, true);

        for(int i=2;i<n+1;i++){
            if(isPrime[i]){
                for(int j=i+i;j<n+1;j+=i)
                    isPrime[j] = false;
            }
        }

        int idx = 0;
        for(int i=2;i<n+1;i++) {
            if (isPrime[i]) {
                primes[idx] = i;
                idx++;
            }
        }

        idx = 0;
        while(n>1){
            if(n%primes[idx]==0){
                n /= primes[idx];
                sb.append(primes[idx]).append("\n");
            }
            else
                idx++;
        }
        System.out.println(sb);
    }
     */
}