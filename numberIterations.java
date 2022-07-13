public class numberIterations {
    public static int anotherSearch(int[] arr, int x){
        int index = -1;
        for(int i=0;i<arr.length;i+=6){ 
            if(arr[i] == x)   
                return i;
        
    /* check the next four indexes as well as if arr[i] is the last element of the array */ 
            else if(arr[i+1] == x && i+1 < arr.length)
                return i+1;
            else if(arr[i+2] == x && i+2 < arr.length)
                return i+2;
            else if(arr[i+3] == x && i+3 < arr.length)
                return i+3;
            else if(arr[i+4] == x && i+4 < arr.length)
                return i+4;
            else if(arr[i+5] == x && i+5 < arr.length)
                return i+5;
        }
        return index;
    }
    public static int binSearch(int[] arr, int x){
        int minIndex = 0, maxIndex = arr.length-1;
        int index = -1;
        boolean keepLooping = true;
        int guessIndex;
        while (keepLooping){
            guessIndex = (maxIndex - minIndex)/2;
            if(maxIndex == minIndex && arr[guessIndex]!=x){
                keepLooping = false;
                break;
            }
            if (arr[guessIndex] == x){
                index = guessIndex;
                break;
            }
            
        }
        return index;
    }
    public static void main(String[] args) {
        int[] arr = new int[1000000];
        for (int i = 0; i<arr.length; i++){
            arr[i] = i;
        }
        if (anotherSearch(arr, 999999) == -1){
            System.out.println("False");
        }
        if (anotherSearch(arr, 999999) != -1){
            System.out.print(anotherSearch(arr,999999));
        }
    }
}
