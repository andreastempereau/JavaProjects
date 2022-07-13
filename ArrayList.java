public class ArrayList{
    private Object[] array;
    private int count = 0;
    public ArrayList(){
        Object array[] = new Object[5];
        count = array.length;
    }
    public ArrayList(int length){
        Object array[] = new Object[length];
        count = array.length;
    }
    public ArrayList(Object[] inputArray){
        Object array[] = new Object[inputArray.length];
        for (int i = 0; i < inputArray.length; i++){
            array[i] = inputArray[i];
        }
        count = array.length;
    }
    public int size(){
        return array.length;
    }
    public Object get(int index){
        return array[index];
    }
    public void remove(int index){
        array[index] = null;
    }
    public boolean add(int index, Object obj){
        if (index > array.length){
            if (array[array.length - 1] != null){
                return false;
            }
            if (array[array.length - 1] == null){
                array[array.length - 1] = obj;
                return true;
            }
        }
        if (index < 0){
            if (array[0] != null){
                return false;
            }
            if (array[0] == null){
                array[0] = obj;
                return true;
            }
        }
        else if (array[index] != null){
            return false;
        }
        else if (array[index] == null){
            array[index] = obj;
            return true;
        }
        return false;
    }
    public String toString(){
        String str = new String();
        for(int i = 0; i < array.length; i++){
            str += array[i] + "\t";
            if (i%5 == 0){
                str += "\n";
            }
        }
        return str;
    }
}