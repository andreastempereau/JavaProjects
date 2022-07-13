import java.util.Scanner;
public class pi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int terms = 1;

        while (terms > 0){

            System.out.println("Enter a number of iterations: ");
            terms = scan.nextInt();
            if (terms < 1) break;
            double sum = 0;
            for (int a = 1; a<= terms; a++){
                sum += Math.pow(-1,a-1)*(1.0/(2*a-1) );

            }
            System.out.println("The approximate value of pi is: " + sum*4 );
        }
    }
}
