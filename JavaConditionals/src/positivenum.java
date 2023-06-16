import java.util.Scanner;
public class positivenum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x ;
        System.out.println("Enter a Number");
        x = sc.nextInt();
        if(x>=0)
        {
            System.out.print("You entered a positive number");
        }else{
            System.out.print("You number is negative and is skipped");
        }
    }
}
