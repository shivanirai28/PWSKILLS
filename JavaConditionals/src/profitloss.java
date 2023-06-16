import java.util.Scanner;
public class profitloss {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int cp;
        int sp;
        System.out.print("Enter the Cost Price : ");
        cp=sc.nextInt();
        System.out.print("Enter the Selling Price : ");
        sp=sc.nextInt();
        int amt;
        if(cp>sp)
        {
            amt=cp-sp;
            System.out.print("The loss is : "+amt);
        }else if(cp<sp)
        {
            amt=sp-cp;
            System.out.print("The profit is : "+amt);
        }else {
            System.out.print("No Profit No Loss");
        }
    }
}
