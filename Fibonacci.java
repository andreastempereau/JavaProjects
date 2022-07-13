import java.util.Scanner;
public class Fibonacci {
    public static int getFibonacci(int n){
        if(n == 1 || n == 2){
            return 1;
        }
        else{
            return (getFibonacci(n-1) + getFibonacci(n - 2));
        }

    }
    public static int getFactorial(int n){
        if (n == 0){
            return 1;
        }
        else{
            return n * getFactorial(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 1;
        while (num !=0){
            System.out.println("Choose a Number");
            num = in.nextInt();
            System.out.println(getFactorial(num));
       }
   } 
}
