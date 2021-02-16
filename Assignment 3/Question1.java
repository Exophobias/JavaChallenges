
public class Question1 {

    public static void main(String[] args) {
        
        int[][] arr = {{5,7,6},{9,1,3},{2,8,4}};
        boolean isSquare = false;

        printArray(convertArray(arr));
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
     * Takes in a two-dimensional int array and converts it and returns a
     * one dimensional array.
     * 
     * @param arr : int[][]     A two dimensional array (An array of arrays)
     * @return : int[]    The 1-dimensional array converted from a two-dimensional array
     */
    static int[] convertArray(int[][] arr) {

        int size = 0;

        for(int i = 0; i < arr.length; i++)
            size += arr[i].length;

        int[] temp = new int[size];
        int count = 0;

        for(int[] x : arr) 
            for(int y : x) {
                temp[count] = y;
                count++;
            }

        return temp;
    }

    /**
     * Overloaded Method that uses a boolean value to determine whether or not the
     * matrix is square. 
     * 
     * @param arr : int[][]     A two dimensional array (An array of arrays)
     * @param isSquare : boolean    Whether or not the matrix is square
     * @return : int[]  The 1-dimensional array converted from a two-dimensional array
     */
    
    static int[] convertArray(int[][] arr, boolean isSquare) {

        if(isSquare) {
            int size = arr.length * arr[0].length;
            int[] temp = new int[size];

            for(int[] x : arr) 
                for(int y : x) {
                    temp[count] = y;
                    count++;
                }

            return temp;
        }

        return convertArray(arr);
    }

}