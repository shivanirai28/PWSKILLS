
import java.util.Scanner;
public class PrimeSum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        if(isPrime(n) && isPrime(n-2))
        {
            System.out.print(true);
        }else{
            System.out.print(false);
        }
    }
    public static boolean isPrime(int n){
        if (n <= 1)
            return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0)//if number is divisible by any number other than 0 and itself, denoted by i, it is not a prime number
            return false;
        }
        return true;
    }
}
