import java.util.Scanner;
public class PercentageMarks {
    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        int mark1 = scn.nextInt();
        int mark2 = scn.nextInt();
        int mark3 = scn.nextInt();
        int total_marks = mark1 + mark2 + mark3;
        int percentage = (total_marks / 3);
        System.out.println(total_marks);
        System.out.println(percentage + "%");
    }
}
