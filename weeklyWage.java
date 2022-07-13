import java.util.Scanner;

public class weeklyWage {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your hourly wage?");
        double hourlyWage = scan.nextDouble();
        System.out.println("How many normal hours did you work?");
        double hoursWorked = scan.nextDouble();
        System.out.println("How many overtime hours did you work?");
        double overtimeHours = scan.nextDouble();
        double overtimeWeeklyWage = hourlyWage * overtimeHours * 1.5;
        double weeklyNormalWage = hourlyWage * hoursWorked;
        double weeklyWageOverall = weeklyNormalWage + overtimeWeeklyWage;
        System.out.println("Your weekly earnings is " + weeklyWageOverall + " dollars.");
    }
}
