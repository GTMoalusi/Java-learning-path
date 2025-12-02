package stringReversal;

import java.util.Scanner;

public class stringReversal {

    public static String reversalStr(String str){
        //3. Start by converting to lowercase
        //str = str.toLowerCase();

        //4. Create an empty string
        String reversalStr = "";

        //5. Create a character Array, store your given strings characters in an Array
        char[] chars = str.toCharArray();

        //6. loop across the array, start from the last index and work backwards to the first index
        for(int i = chars.length - 1; i >= 0; i--){
            //7. Store each character into your empty created string
            reversalStr += chars[i];
        }

        //8. Return the reversed string.
        return reversalStr;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your string: ");
        String str = scanner.nextLine();

        System.out.println("Given String is " + str + " and the reversal String is: " + reversalStr(str));
    }
}
