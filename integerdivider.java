import java.util.Scanner;
public class integerdivider {
   public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       System.out.print("Input first integer: ");
       int firstInt = scan.nextInt();
       System.out.print("Enter second integer: ");
       int secondInt = scan.nextInt();
       System.out.println("1st\t2nd");
       for (int a = 1; a<=200; a++){
           if(firstInt%a == 0 & secondInt%a == 0){
               System.out.println(a + "\t" + a);
           }
       }

   } 
}
