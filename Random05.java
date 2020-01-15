import java.util.Scanner;
public class Random05 {
    public static void main(String[] args) {
        boolean marker = true;
        while (marker) {
            System.out.println("Enter a Number:");
            Scanner scan = new Scanner(System.in);
            double Num = scan.nextDouble();
            double Div = Num / 2;
            int One = (int) Div;
            double Two = (double) One;
            if (Div == Two) {
                System.out.println("Even");
            } else {
                System.out.println("Odd");
            }
        }

    }
}
