package stringReversal;

import java.util.Scanner;

public class stringReversal {

    public static String isEqual(String str){
        str = str.toLowerCase();

        String reversedStr = "";

        char[] chars = str.toCharArray();

        for(int i = chars.length - 1; i >= 0; i--){
            reversedStr += chars[i];
        }

        return reversedStr;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your string: ");
        String str = scanner.nextLine();

        System.out.println(isEqual(str));

    }
}
