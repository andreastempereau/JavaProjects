import java.util.Scanner;

public class surfaceCube {
   public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       System.out.print("Enter a side length: ");
       int input = scan.nextInt();
       int input2 = input * input;
       System.out.println("The Surface area is " + 6*input2);
   } 
}
