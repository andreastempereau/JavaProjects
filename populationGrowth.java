import java.util.Scanner;
public class populationGrowth {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter inital population: ");
        double initalPop = scan.nextDouble();
        System.out.println("Enter growth rate:");
        double growthRate = scan.nextDouble();
        System.out.println("How long does it take to achieve this growth rate? ");
        double growthPeriod = scan.nextDouble();
        System.out.println("How much time has passed so far so I can calculate?");
        double timePassed = scan.nextDouble();
        double timeMultiplier = timePassed/growthPeriod;
        double popGrowthTime = initalPop * growthRate;
        double finalPop = timeMultiplier * popGrowthTime;
        System.out.println("Final population is " + finalPop);
    }
    
}
