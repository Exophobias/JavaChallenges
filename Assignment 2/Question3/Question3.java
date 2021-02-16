import java.util.ArrayList;
import java.util.Random;

public class Question3 {

    public static void main(String[] args) {

        ArrayList arr = new ArrayList();

        System.out.println(arrayListAppend(arr, 50));
    }

    /**
     * Populates an ArrayList with random numbers to a maximum of int size
     * 
     * @param arr : ArrayList   An empty ArrayList
     * @param size : Int    The value of which to populate the ArrayList
     * @return boolean    Return true or false if Array population is successful
     */
    static boolean arrayListAppend(ArrayList arr, int size) {

        Random rnd = new Random();

        for (int i = 0; i <= size; i++) {
            int x = rnd.nextInt(100);
            arr.add(x);
        }

        return true;
    }

}