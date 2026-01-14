import java.util.Scanner;
public class circle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double R;
        double C;
        double A;
        System.out.print("Enter radius of your circle");
        R= input.nextDouble();
        C = 2*3.14159*R;
        A = 3.14159*(R*R);
        System.out.println("your circumference is"+C);
        System.out.println("Your area is"+A);
        input.close();

    }

}

