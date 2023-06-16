import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int fact = 1;
        for (int i = 2; i <= n; i++){
            fact *= i;
        }
        System.out.println(fact);
    }
}
