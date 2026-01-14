import java.util.Scanner;
public class AREA {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter Hieght Of Trapezoid : ");
        double h= input.nextDouble();
        System.out.print("Enter Two Parallel Sides : " );
        double a = input.nextDouble();
        double b = input.nextDouble();
        double K = (a+b)/2*h;
        System.out.print("Area Of Trapezoid Is : "+K);
        input.close();
    }
    
}

