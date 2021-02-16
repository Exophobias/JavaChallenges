
public class Question1 {

    public static void main(String[] args) {
        
        String input = "racecar";

        System.out.println(isPalindrome(input));
    }

    /**
     * Reverse a given string
     * 
     * @param input : String    Any string to reverse
     * @return reversedString : String  The original input string reversed
     */
    static String reverseString(String input) {

        String reversedString = "";

        for(int i = input.length() - 1; i >= 0; i--) 
            reversedString += input.charAt(i);

        return reversedString; 
    }

    /**
     * 
     * @param input : String    Given an input string which will be reversed and checked if its a palindrome
     * @return : Boolean    Return true or false if the input is a palindrome
     */
    static boolean isPalindrome(String input) {

        String reversedString = reverseString(input);
        System.out.println(reversedString);

        if(input.equalsIgnoreCase(reversedString))
            return true;

        return false;
    }

}