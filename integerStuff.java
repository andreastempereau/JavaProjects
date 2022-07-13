import java.util.Scanner;

public class integerStuff {
    public static double getAverage(int[] a){
        double sum = 0;
        for (int b = 0; b<a.length; b++){
            sum+= a[b];
        }
        double average = sum/a.length;
        return average;
    }
    public static int getMode(int[] a){
        int [] counts = new int[a.length];
        for (int i = 0; i<a.length;i++){
            counts[i] = 1;
            for (int x=i+1; x<a.length;x++){
                if (a[i] == a[x]) counts[i]++;
            }
        }
        int maxCount = counts[0];
        int maxCountPos = 0;
        for (int z = 1; z<counts.length; z++){
            if (counts[z]>maxCount){
                maxCount = counts[z];
                maxCountPos = z;
            }
        }
        return a[maxCountPos];
    }
    public static double getMedian(int[] a){
        int currentMin= a[0], currentMinLoc = 0, tempIndex = 0;
        double median;
        int[] temp = new int[a.length];
        boolean[] isUsed = new boolean[a.length];

        while (tempIndex<a.length){
            for(int z = 0; z<a.length;z++){
                if(isUsed[z] == false) currentMin = a[z];
            }
            for (int z=0; z<a.length; z++){
                if (a[z] <= currentMin && isUsed[z] == false){
                    currentMin = a[z]; currentMinLoc = z;
                }
            }
            temp[tempIndex] = currentMin;
            tempIndex++;
            isUsed[currentMinLoc] = true;
        }
        if (temp.length%2!=0) median = temp[temp.length/2];
            else median = ((temp[temp.length/2-1])) + temp[temp.length/2]/2.0;
        return median;
    }
    public static double getStandDev(int[] a){
        double stanDev = 0;
        double temp = 0;
        double mean = getAverage(a);
        for (int z = 0; z < a.length; z++){
            temp += Math.pow(a[z]-mean, 2);
        }
        stanDev = Math.sqrt(temp/a.length);
        return stanDev;
    }
    public static int getRange(int[] a){
        int range = 0;
        int maxCurrent = a[0];
        int minCurrent = a[0];
        for(int z = 0; z < a.length; z++){
            if (a[z] > maxCurrent){
                maxCurrent = a[z];
            }
            if (a[z] < minCurrent){
                minCurrent = a[z];
            }
        }
        range = maxCurrent - minCurrent;
        return range;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] evens = new int[10];
        int[] odds = new int[10];
        int[] negs = new int[10];
        int[] intList = new int[10];
        int evenIndex = 0;
        int oddIndex = 0;
        int negIndex = 0;
        int intIndex = 0;

        System.out.println("Enter 10 integers seperated by spaces and I will sort them out");
        int input;
        for (int a = 1; a<=10; a++){
            input = scan.nextInt();
            intList[intIndex] = input;
            intIndex++;
            if (input%2 == 0){
                evens[evenIndex] = input;
                evenIndex++;
            }
            if (input%2 != 0){
                odds[oddIndex] = input;
                oddIndex++;
            }
            if (input<0){
                negs[negIndex] = input;
                negIndex++;
            }
        }
        System.out.println("Here is some information about numbers.");
        System.out.print("All the numbers inputted are: ");
            for (int a = 0; a<intIndex;a++){
                System.out.print(intList[a] + ", ");
            }   
        System.out.println("");
        System.out.print("The even numbers were: ");
        for (int a = 0; a<evenIndex;a++){
            System.out.print(evens[a] + ", ");
        }
        System.out.println("");
        System.out.print("The odd numbers were: ");
        for (int a = 0; a<oddIndex;a++){
            System.out.print(odds[a] + ", ");
        }
        System.out.println("");
        System.out.print("The negative numbers were: ");
        for (int a = 0; a<negIndex;a++){
            System.out.print(negs[a]+ ", ");
        }
        System.out.println("" + "\n");
        System.out.println("List Averages and Modes");
        System.out.println("The average of those numbers is: " + getAverage(intList));
        System.out.println("The average of the even numbers is: " + getAverage(evens));
        System.out.println("The average of the odd numbers is: " + getAverage(odds));
        System.out.println("The average of the negative numbers is: " + getAverage(negs));
        System.out.println("The mode of those numbers is " + getMode(intList));
        System.out.println("The median of those numbers is " + getMedian(intList));
        System.out.println("The range of those numbers is " + getRange(intList));


    }
}
