import java.util.Scanner;
import java.util.Arrays;

public class intfilledarray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] arr = new int[5][5];
        int index = 1;
        int index3 = 1;
        int index2 = 1;
        for(int i = 0; i < arr.length; i++){
            for (int j = 0; j < 5;j++){
                arr[i][j] = index;
                index++;
            }
        }
        System.out.println(Arrays.deepToString(arr)
        .replace("],","\n").replace(",","\t ")
        .replaceAll("[\\[\\]]", " "));
        for(int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[0].length;j++){
                arr[j][i] = index3;
                index3++;
            }
        }
        for(int i = 0; i < arr.length; i++){
            for (int j = 0; j < 5;j++){
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println("");
        }
        System.out.println("How many rows?");
        int inputRows = scan.nextInt();
        System.out.println("How many columns?");
        int inputCols = scan.nextInt();
        int[][] arr2 = new int[inputRows][inputCols];
        for(int i = 0; i < inputRows; i++){
            for (int j = 0; j < inputCols;j++){
                arr2[i][j] = index2;
                index2++;
            }
        }
        System.out.println(Arrays.deepToString(arr2)
        .replace("],","\n").replace(",","\t ")
        .replaceAll("[\\[\\]]", " "));
    } 
}
