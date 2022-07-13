public class ArrayResizer {
   public static boolean isNonZeroRow(int[][] array2D, int r){
       for(int i = 0; i<array2D[r].length; i++){
           if(array2D[r][i] == 0){
               return false;
           }
       }
       return true;
   }
   public static int numNonZeroRows(int[][] array2D){
       int count = 0;
       for(int i = 0; i<array2D.length; i++){
           if (isNonZeroRow(array2D, i) == true){
               count++;
           }
       }
       return count;
   }
   public static int[][] resize(int[][] array2D){
       int count = numNonZeroRows(array2D);
       int[][] newArr = new int[count][array2D[0].length];
       int newArrayRowIndex = 0;
       for(int i = 0; i<array2D.length; i++){
           if(isNonZeroRow(array2D, i) == true){
               for(int j = 0; j<array2D[i].length; j++){
                   newArr[newArrayRowIndex][j] = array2D[i][j];
               }
               newArrayRowIndex++;
           }
       }
       return newArr;
   }
}
