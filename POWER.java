import java.util.Scanner;
public class POWER {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("ENTER VOLTMETER READING : ");
        double V = input.nextDouble();
        System.out.print("ENTER AMMETER READING : ");
        double I = input.nextDouble();
        double P = I*V;
        System.out.print("Your Calculated Power Is "+ P + "W");
        input.close();
    
    }
}

