import java.util.Scanner;
public class swapnumber {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter 1st number");
        int x = scn.nextInt();
        System.out.println("Enter 2nd number");
        int y = scn.nextInt();
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println(x);
        System.out.println(y);
    }
}
