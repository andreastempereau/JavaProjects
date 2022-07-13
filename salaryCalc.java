import java.util.Scanner;

public class salaryCalc {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Input starting salary");
        int startingSal = scan.nextInt();

        System.out.println("Input percent increase in decimal");
        double percentInc = scan.nextDouble();

        System.out.println("Input number of years");
        int numYears = scan.nextInt();
        
        System.out.println("Year\tSalary");
        for (int a = 1; a<=numYears; a++){
            System.out.println(a + "\t" + startingSal * Math.pow(1+percentInc, a-1));
        }
    }
}
