import java.util.Scanner;
public class triangleDetector {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 1st side length");
        double firstLength = scan.nextDouble();
        System.out.println("Enter a 2nd side lnegth");
        double secondLength = scan.nextDouble();
        System.out.println("Enter the last side length");
        double thirdlength = scan.nextDouble();
        double a2b2 = (firstLength * firstLength) + (secondLength * secondLength);
        double c2 = (thirdlength * thirdlength);
        if (a2b2 == c2){
            System.out.println("Your triangle is a right triangle");
        }
        else System.out.println("Triangle is not a right traingle");
    }
}
