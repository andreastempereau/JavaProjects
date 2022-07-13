import java.util.Scanner;
import java.util.Arrays;
public class magicSquare {
    public static void main(String[] args) { 
        int i, j;
        int sum_row, sum_col, sum_diagonal = 0, sum = 0;
        boolean magic=true;
        Scanner scan = new Scanner(System.in);
        int[][] square = new int[3][3];
        System.out.print("Enterers --> ");
        for (i=0; i<3; i++)
            for (j=0; j<3; j++) 
                square[i][j] = scan.nextInt();
        System.out.println("Square");
        for (i=0; i<3; i++) {
            for (j=0; j<3; j++) 
                System.out.print(square[i][j] + " ");
        System.out.println();
        }
        for (j=0; j<3; j++)
            sum += square[0][j];
        for (i=1; i<3; i++) {
            sum_row = 0;
            for (j=0; j<3; j++)
                sum_row += square[i][j];
        if (sum_row != sum) {
            magic = false;
            break;
            }
        }
        if (magic) {
        for (j=0; j<3; j++) {
            sum_col = 0;
            for (i=0; i<3; i++)
                sum_col += square[i][j];
                if (sum_col != sum) {
                    magic = false;
                  break;
                }
            }
        }
    if (magic) {
        for (i=0; i<3; i++)
            for (j=0; j<3; j++)
                if (i==j)
                    sum_diagonal += square[i][j];
                if (sum_diagonal != sum) {
                    magic = false;
                }
            }
    if (magic) {
        sum_diagonal = 0;
        for (i=0; i<3; i++)
            for (j=0; j<3; j++)
                if ((i+j) == 2)
                    sum_diagonal += square[i][j];
                if (sum_diagonal != sum) {
                    magic = false;
                }
            }
    if (magic)
        System.out.println("It magic square!");
        System.out.println(Arrays.deepToString(square)
                    .replace("],","\n").replace(",","\t| ")
                    .replaceAll("[\\[\\]]", " "));
    if (magic = false){
        System.out.println("ItOT a magic square.");
        System.out.println(Arrays.deepToString(square)
        .replace("],","\n").replace(",","\t| ")
        .replaceAll("[\\[\\]]", " "));
    }
    } 
}