
public class Question3 {

    public static void main(String[] args) {
    
        // The initial data in 4 arrays required in the question. The 2D array can be of any size. Can be more than 4 arrays or less than. (Universal)
        int[][] arr = {{4835, 24794, 13827, 10470, 10210, 10310, 14868},{11384, 16781, 8090, 8565, 10666, 15162, 13828},{14246, 8416, 19782, 20617, 7700, 21225, 34826},{22881, 17980, 26924, 18568, 19299, 22164, 21992}};

        System.out.println("\t\t Sun \t Mon \t Tue \t Wed \t Thu \t Fri \t Sat \t\t Total \t\t Avg.");
        System.out.println("\t\t ----- \t ----- \t ----- \t ----- \t ----- \t ----- \t ----- \t\t ----- \t\t -----");

        //A value that I am using for formatting since the index always starts at 0 in an array. 
        int weekValue = 1;

        //This statement prints out the entire table of all the weekly data and its total and average.
        for(int i = 0; i < arr.length; i++) {
                System.out.print("Week " + weekValue + "\t" + printArray(arr[i]) + "\t" + rowTotal(arr, i) + " \t\t" + getRowAverage(arr, rowTotal(arr, i)) + "\n");

            weekValue++;
        }

        System.out.println("\t\t ----- \t ----- \t ----- \t ----- \t ----- \t ----- \t ----- \t\t ----- \t\t -----");

        int[] columnSums = columnTotal(arr);

            //
            System.out.print("Total \t" + printArray(columnSums) + "\n");
            System.out.print("Avg. \t ");

            /**
             * Similar to the other for loop, this uses a for loop to grab each index of the array which represents 
             * each column total. When calling the getColumnAveragem the counter variable (i) is sent and is used in
             * the method to determine what index to grab from the columnSums
             */
            for(int i = 0; i < arr[0].length; i++) {
                System.out.print(getColumnAverage(columnSums, i, arr.length) + "\t");
        }
    }

    /**
     * Iterates through a given 1-dimension int array and adds all values to a string
     * 
     * @param arr : int[]   A 1-dimensional array of numbers
     * @return : String     Return a string of the 1-dimensional array together
     */
    static String printArray(int[] arr) {

        String temp = "  ";

        for(int x : arr)
            temp += x + "\t  ";

        return temp;
    }

    /**
     * Takes in a 2-dimensional int array and a counter value. The counter value represents what week/array/row to 
     * iterate through and sum up all the values of the row
     * 
     * @param arr : int[][]     A 2-dimensional array of intial data
     * @param counterValue : int        The value of the counter in the for loop. This represents what week/row to look at
     * @return : int    The sum of the entire row
     */
    static int rowTotal(int[][] arr, int counterValue) {

        int sum = 0;

        for(int x : arr[counterValue])
            sum += x;
    
        return sum;
    }
    
    /**
     * Takes in a 2-dimensional array which is used to determine the length of each row. It then uses the value from the 
     * rowTotal() method and divides by the length to get the average of the row
     * 
     * @param arr : int[][]     A 2-dimensional array of intial data
     * @param rowTotal : int    The int sum of a row
     * @return : int    The average of the row
     */
    static int getRowAverage(int[][] arr, int rowTotal) {
        
        return rowTotal / arr[0].length;
    }

    /**
     * Takes in a 2-dimensional array to be used to determine the length of each row and prevents hard coded values
     * 
     * @param arr : int[][]     A 2-dimensional array of intial data
     * @return : int[]     A 1-dimensional array of the sums of each column (weekday)
     */
    static int[] columnTotal(int[][] arr) {

        int[] columnSums = new int[arr[0].length];

        int temp;

        /**
         * This will start at row 1 (index 0) and iterate through all of it. The first iteration will set each index
         * of the array to all the values of Week 1. Second iteration will sum the value of Week 2 with the same respective
         * locations in the array.
         */
        for(int i = 0; i < arr.length; i++)
            for(int j = 0; j < arr[0].length; j++) {
                temp = columnSums[j];
                columnSums[j] = temp + arr[i][j];
            }

        return columnSums;
    }

    /**
     * Uses the total of a column and divides by the number of rows.
     * 
     * @param columnSums : int[]   A 1-dimensional array of the sums of each column (weekday)
     * @param counterValue : int[]     The counter value of the for loop which is used to get the correct index for each weekday
     * @param weekValue : int[]    The value of how many weeks (rows) there are in the initial data
     * @return
     */
    static int getColumnAverage(int[] columnSums, int counterValue, int weekValue) {

        return columnSums[counterValue] / weekValue;
    }

}