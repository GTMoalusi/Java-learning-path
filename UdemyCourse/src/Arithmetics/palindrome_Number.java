package Arithmetics;

import java.util.Scanner;

public class palindrome_Number {

    public static boolean isPalindrome(int x){

        String myString = Integer.toString(x);

        StringBuilder reverseString = new StringBuilder();

        char[] ch = myString.toCharArray();

        for(int i = ch.length - 1; i >= 0; i--){
            reverseString.append(ch[i]);
        }

        return myString.contentEquals(reverseString);
    }

    public static void main(String[] args) {
        /*Leetcode Challenge easy-mode
        * Given an integer x, return true if x is a palindrome, and false otherwise.
        *
        * Example1:
        * Input: x = 121
        * Output: true
        *
        * Example2:
        * Input: x = -121
        * Output: false
        *
        * Follow up: Could you solve it without converting the integer to a string? Still trying to come up with a soltion....
        *
        * Solution steps
        * 1. input: int x
        * 2. We are going to convert int to string
        * 3. We are going to use a StringBuilder and append what we need inside the reverse variable
        * 4. We need to store our newly created string into characters so that we can loop each character and store it
        * 5. We need to loop the characters from last to the beginning...
        * 6. We will compare the original string with reverse and return true if they match or false otherwise.
        * */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your integer: ");
        int x = scanner.nextInt();
        scanner.nextLine(); //Clears the scanner..

        System.out.println("Output: " + isPalindrome(x));

        scanner.close();
    }
}
