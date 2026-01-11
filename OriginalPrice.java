import java.util.Scanner;
public class OriginalPrice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your discount price : ");
        double DSP=input.nextDouble();
        System.out.print("Enter Discouunt Percentage : ");
        double DP=input.nextDouble();
        double OP=DSP*(100/DP);
        System.out.print("Original Price Is : "+OP);

    }
}
