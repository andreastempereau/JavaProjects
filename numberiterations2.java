public class numberiterations2 {
    public static int findNumber(int[] arr, int x){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == x){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = new int[1000000];
        for (int i = 0; i<arr.length; i++){
            arr[i] = i;
        }
        if(findNumber(arr, 999999) == -1){
            System.out.println("False");
        }
        if(findNumber(arr, 999999) != -1){
            System.out.println(findNumber(arr, 999999));
        }
    }
}
