package stringReversal;

import java.util.Scanner;

public class reverseWord {

    public static String reversedWords(String str){
        String[] words = str.split(" ");

        String results = "";

        for(String word : words){
            String reverseWords = "";
            for(int i = word.length() - 1; i >= 0; i--){
                reverseWords += word.charAt(i);
            }
            results += reverseWords + " ";
        }

        return results.trim();
    }

    public static void main(String[] args) {
        //Problem Statement: Reverse only the words in a sentence, not the sentence order...

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your string: ");
        String str = scanner.nextLine();

        System.out.println(reversedWords(str));

        scanner.close();
    }
}
