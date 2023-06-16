import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int a = 1;
        int b = 1;
        for(int i = 1; i<= n;i++){
            System.out.print(a+" ");
            int sum = a+b;
            a = b;
            b = sum;
             
        }
    }
}
