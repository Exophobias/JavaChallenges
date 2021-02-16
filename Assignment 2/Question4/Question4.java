import java.util.Random;
import java.nio.IntBuffer;
import java.util.Arrays;

public class Question4 {

    public static void main(String[] args) {
        
        int size = 50;
        int[] arr = new int[size];
        boolean flag = true;

        arr = populateArray(arr, size);

        System.out.println();

        System.out.println("Quicksort: " + quicksortArrayMinMax(arr, flag));
        System.out.println("Inequality Sort: " + inequalityMinMax(arr, flag));
        System.out.println("End of Code Run");
    }

    /**
     * Populates an array with random numbers but to a maximum of int : size
     * @param arr : int[]   An empty int[] array
     * @param size : int   An integer value to which the array with be populated too.
     * @return arr Return the populate int[] array
     */
    static int[] populateArray(int[] arr, int size) {

        Random rnd = new Random();
        int x;

        for(int i = 0; i < size; i++) {

            x = rnd.nextInt(100);

            if (x == 0) {
                x += 1;
            }

            arr[i] = x;
            System.out.print(x + " ");
        }

        return arr;
    }

    /**
     * Takes in an int[] array and sorts it. If the minMax variable is false, it returns the lowest value in the array
     * If the minMax variable is true, it will return the highest value in the array
     * 
     * @param arr : int[]   A populated array of random numbers
     * @param flag : boolean  A boolean that determines if lowest or highest value is returned
     * @return int  The lowest or highest value in the array
     */
    static int quicksortArrayMinMax(int[] arr, boolean flag) {

        int size = arr.length;
        Arrays.sort(arr);

        if(flag == true)
            return arr[size - 1];

        return arr[0];
    }

    /**
     * A method that uses inequalities to determine the highest or lowest values in a randomly populated int[] array
     * 
     * Coded by Derik. Not for evaluation but for archival purposes and understanding
     * 
     * @param arr : int[]   A populated array of random numbers
     * @param flag : boolean    A boolean that determines if lowest or highest value is returned
     * @return int  The lowest or highest value in the array
     */
    static int inequalityMinMax(int[] arr, boolean flag) {

        int max = arr[0];
        int min = arr[0];
        for(int i : arr) {
            if(i > max)
                max = i;
            if(i < min)
                min = i;
        }

        if(flag)
            return max;
        
        return min;
    }
}