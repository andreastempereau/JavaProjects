import java.util.Scanner;

public class Division {
   public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       System.out.println("Enter larger number: ");
       double largerNumber = scan.nextDouble();
       System.out.println("Enter smaller number: ");
       double smallerNumber = scan.nextDouble();
       System.out.println("The quotient is: " + largerNumber/smallerNumber);
       System.out.println("The remainder is: " + largerNumber%smallerNumber);
   } 
}
