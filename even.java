import java.util.Scanner;
public class even {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int num = input.nextInt();
        if (num % 2==0) {
            System.out.println("Number Is EVEN");
        }else{
            System.out.print("Number Is ODD");
        }
        input.close();
            
    }
}
