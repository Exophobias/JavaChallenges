import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Question2 {

  public static void main(String[] args) {

    String[][] arr = namesToArray();

    System.out.println();
    
    System.out.printf("Avg. Frequency of Male Names: %.6f \n", maleFrequencyAvg(arr));
    System.out.printf("Avg. Frequency of Female Names: %.6f \n", femaleFrequencyAvg(arr));
    System.out.println("List of Names that exist as Boy/Girl: " + maleFemaleNameMatch(arr));
    System.out.println();
    System.out.println("All names that occur with matching frequency between boy/girl: " + frequencyMatch(arr));

  }

  /**
   * Takes in a 2-dimension array and prints each element
   * 
   * @param arr : String[][]  The text file as a 2-dimensional array
   */
  static void printArr(String[][] arr) {

    for(String[] s : arr)
      for(String t : s)
        System.out.println(t);
  }

  /**
   * Overloaded method that takes in a 1-dimensional array
   * 
   * @param arr
   */
  static void printArr(String[] arr) {

    for(String s : arr)
      System.out.println(s);
  }

  /**
   * Grabs all the frequencies of male names, add thems, then divides by the total number to get an average
   * 
   * @param arr : String[][]  The 2-dimensional array of babynames data
   * @return : int  The average frequency
   */
  static double maleFrequencyAvg(String[][] arr) {

    double sum = 0;
    int counter = 0;

    for(int i = 0; i < arr.length; i++) {
      sum += Double.parseDouble(arr[i][3]);
      counter++;
    }

    return sum / counter;
  }

  /**
   * Grabs all the frequencies of female names, add thems, then divides by the total number to get an average
   * 
   * @param arr : String[][]  The 2-dimensional array of babynames data
   * @return : int  The average frequency
   */
  static double femaleFrequencyAvg(String[][] arr) {

    double sum = 0;
    int counter = 0;

    for(int i = 0; i < arr.length; i++) {
      sum += Double.parseDouble(arr[i][6]);
      counter++;
    }

    return sum / counter;
  }

  /**
   * Takes in a 2-dimensional array and grabs element 1 of the first String[], then iterates through all other String[]
   * in the 2-dimensional array at the element where female names always are. Then compares them and concats them to a 
   * string if a matching pair is found
   * 
   * @param arr : String[][]  The 2-dimensional array of babynames data
   * @return : String   Return a concatted String of all names that occur as both male and female
   */
  static String maleFemaleNameMatch(String[][] arr) {

    String nameList = "";
    for(int i = 0; i < arr.length; i++) {

      String male = arr[i][1];
      for(int j = 0; j < arr.length; j++) {
        if(male.equalsIgnoreCase(arr[j][4])) {
          nameList += arr[i][4] + ", ";
        }
      }
    }
    return nameList;
  }

  /**
   * Takes in a 2-dimensional array and grabs element 3 (the male frequency) and then iterates through all String[] in the
   * 2D array and compares all frequencies of the females. If they match, then it concats a string of the two names that
   * have the same frequency.
   * 
   * @param arr : String[][]  The 2-dimensional array of babynames data
   * @return : String   Return a concatted String of all names that have the same frequency between boy and girl
   */
  static String frequencyMatch(String[][] arr) {

    String nameList = "";
    for(int i = 0; i < arr.length; i++) {

      String maleFrequency = arr[i][3];
      for(int j = 0; j < arr.length; j++) {
        if(maleFrequency.equalsIgnoreCase(arr[j][6])) {
          nameList += arr[i][1] + " and " + arr[j][4] + ", ";
        }
      }
    }
    return nameList;
  }

  /**
   * Reads a text file using Scanner and puts each line into a String[] and adds that String[] to a 2-dimensional array
   * and returns it.
   * 
   * @return : String[][]   Returns a 2-dimensinal array of all lines of a text file as 1D arrays (String[])
   */
  public static String[][] namesToArray() {

    ArrayList<String> parsedArray = new ArrayList<String>();
    String text_path = "babynames.txt";

    try {

      File fl = new File(text_path);
      Scanner input = new Scanner(fl);

    while(input.hasNextLine()) 
        parsedArray.add(input.nextLine());

    input.close();
    } catch(FileNotFoundException e) {

      System.out.println("An error occurred.");
      e.printStackTrace();
    }

    String[] arrTemp = parsedArray.toArray(new String[parsedArray.size()]);
    String[][] arr = new String[arrTemp.length][7];

    for(int i = 0; i < arrTemp.length; i++) {
      String[] temp = arrTemp[i].split("  ");
      for(int j = 0; j < temp.length; j++) 
        arr[i][j] = temp[j];
    }

    return arr;
  }

  
}