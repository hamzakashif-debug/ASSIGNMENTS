import java.util.Scanner;
public class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter First Side Of Triangle : ");
        double S1 = input.nextDouble();
        System.out.print("Enter Second Side Of Triangle : ");
        double S2 = input.nextDouble();
        System.out.print("Enter Third Side Of Triangle : ");
        double S3 = input.nextDouble();
        if ((S1+S2)>S3 && (S2+S3)>S1 && (S1+S3)>S2) {
        double S = (S1+S2+S3)/2;
        double A = Math.sqrt(S*(S-S1)*(S-S2)*(S-S3));
        System.out.println(A);
        }else{
        System.out.print("These Lengths Not Form A Triangle");
        }
        input.close();
    }
}
