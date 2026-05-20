package Hard;
import java.util.Scanner;
public class Nineteenth {
    public static boolean isPrime(long n) {
        if (n < 2) return false;
        if (n % 2 == 0) return n == 2;
        for (long i = 3; i * i <= n; i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        long a = sc.nextInt(); 
        sc.close();
        System.out.println(isPrime(a) ? "Prime": "Not prime");
    } 
}