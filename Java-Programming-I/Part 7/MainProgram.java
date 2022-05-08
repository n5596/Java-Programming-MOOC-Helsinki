
public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 12};
    }
    
    public static int smallest(int[] array){
        int smallest_idx = indexOfSmallest(array);
        return array[smallest_idx];
    }

    public static int indexOfSmallest(int[] array){
        int smallest_idx = 0;
        for (int i=0; i<array.length; i++){
            if (array[smallest_idx] > array[i]){
                smallest_idx = i;
            }
        }  
       return smallest_idx;
    }
    
    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int n = table.length;
        int new_length = n-startIndex;
        int[] array = new int[new_length];
        
        for (int i=startIndex; i<n; i++){
            array[i-startIndex] = table[i];
        }
        return indexOfSmallest(array)+startIndex;
    }
    
    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
    
    public static void sort(int[] array) {
        int smallest_idx;
        for (int i=0; i<array.length-1; i++){
            smallest_idx = indexOfSmallestFrom(array, i);
            swap(array, i, smallest_idx);
        }
    }
}
