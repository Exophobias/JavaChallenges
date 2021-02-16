import java.util.Arrays;

public class Question2 {

    public static void main(String[] args) {
        
        int[] arr1 = {1,3,5};
        int[] arr2 = {2,4,6};

        printArray(arrayMerge(arr1, arr2));
    }

    /**
     * Prints the value of all the indices in an array
     * 
     * @param arr : int[]   A populated array of size n
     */
    static void printArray(int[] arr) {

        for(int x : arr)
            System.out.print(x + " ");
    }

    /**
     * Takes in two arrays, merges them into one array. Then sorts the array and returns the sorted array
     * 
     * @param arr1 : int[]  An array of size n
     * @param arr2 : int[]  An array of size n 
     * @return temp The two arrays combined into one and sorted
     */
    static int[] arrayMerge (int[] arr1, int[] arr2) {

        int size = arr1.length + arr2.length;
        int[] temp = new int[size];

        for(int i = 0; i < arr1.length; i++) {
            temp[i] = arr1[i];
        }

        int i2 = 0;

        for(int i = arr1.length; i < size; i++) {
                temp[i] = arr2[i2];
                i2++;
        }

        Arrays.sort(temp);

        return temp;
    }

}