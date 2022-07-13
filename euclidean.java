import java.util.Scanner;
public class euclidean {
   public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       System.out.println("Enter the first number: ");
       int n1 = scan.nextInt();
       System.out.println("Enter the second number: ");
       int n2 = scan.nextInt();
       if (n1<n2){
           System.out.println("The remainder is " + n2%n1);
            while(n1>0){
                int r1 = n2%n1;
               n2 = n1;
               n1 = r1;
           }
           System.out.println("The GCD is " + n2);
       }
       if (n2<n1){
           System.out.println("The remainder is " + n1%n2);
           while(n2>0){
            int r2 = n1%n2;
            n1 = n2;
            n2 = r2;
           }
           System.out.println("The GCD is " + n1);
       }
   }
}
