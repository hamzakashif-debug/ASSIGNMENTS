import java.util.Scanner;
public class Discount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double OP ;
        double DP;
        double DSP;
        System.out.print("Enter Your original price :");
        OP=input.nextDouble();
        System.out.print("Enter Your Discount Percentage :");
        DP=input.nextDouble();
        DSP=OP-(OP*DP/100);
        System.out.println("Your Discounted Price is "+DSP);

    }

}
