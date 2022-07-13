import java.util.Scanner;

public class exponent {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a base number: ");
        double base = scan.nextDouble();
        System.out.println("Enter a number you want it raised to: ");
        double power = scan.nextDouble();
        System.out.println(Math.pow(base, power));
    }
}
