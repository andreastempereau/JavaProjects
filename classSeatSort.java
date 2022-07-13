public class classSeatSort {
    public String classSorter(String arr[]){
        int lengthArr = arr.length;
        int count = 0;
        String str = "";
        String[][] classSort = new String[4][8];
        for(int i = 0; i < classSort.length; i++) {
            for(int j = 0; j<classSort[0].length;j++){
                classSort[j][i] = arr[count];
                count++;
                str += classSort[j][i] + "\t";
            }
            str += "\n";
        }
        return str;
    }
    public static void main(String[] args) {
        String arr[] = {"a", "b", "c", "d", "e", "f", "g", "h", "i",
                        "j", "k", "l", "m", "n", "o", "p", "q", "r",
                        "s", "t", "u", "v", "b", "b", "b", "b", "b",};
    }
}
