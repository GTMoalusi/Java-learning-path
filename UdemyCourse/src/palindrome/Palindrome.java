package palindrome;

import java.util.Scanner;

public class Palindrome {

    public static Boolean isPalindrome(String str){

        //1. Convert the string to lowercase (in java madam is not the same as Madam or MADAM)
        str = str.toLowerCase();

        //2. Create an empty string (we need to compare the given string to something innit...)
        StringBuilder reversedStr = new StringBuilder();

        //3. Create an Array of char (this makes it easier to compare every single character from the given string)
        char[] myChar = str.toCharArray();

        //4. We need to loop across the array so that we can extract the letters one by one and store them in our empty string we created...
        for(int i = myChar.length - 1; i >= 0; i--){

            //5. While looping we are going to Append/Store into the empty string
            reversedStr.append(myChar[i]);
        }

        //6. Compare the new appended string to the given string
        return str.contentEquals(reversedStr);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your string: ");
        String str = scanner.nextLine();

        //7. If they compare output it is a Palindrome, else it is not.
        if(isPalindrome(str)){
            System.out.println("It is a Palindrome");
        }else{
            System.out.println("It is not a Palindrome");
        }
    }
}
