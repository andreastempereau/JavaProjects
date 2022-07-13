import java.util.Scanner;
public class leapyearchecker {
   public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       int year = 1;
       while (year>0){
            System.out.print("Please input a year or input 0 to stop: ");
            year = scan.nextInt();
            if (year > 1582){
                if (year%4 == 0){
                    if (year%100 == 0){
                        if(year%400 == 0){
                            System.out.println("This is a leap year");
                        }
                        else System.out.println("This is not a leap year");
                    }
                    else System.out.println("This is a leap year");
                }
                else System.out.println("Not a leap year"); 
            }
            else System.out.println("Not a leap year");
        } 
    }
}