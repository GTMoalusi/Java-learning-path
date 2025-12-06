package stringReversal;

import java.util.Scanner;

public class countWordsWithoutSplit {

    public static int countWords(String str){
        boolean inWord = false;
        int counter = 0;

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(ch != ' '){
                if(!inWord){
                    counter++;
                    inWord = true;
                }
            }else{
                inWord = false;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        //Count words in the string without using a string.split() function/method...
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your string: ");
        String str = scanner.nextLine();

        System.out.println("Number of words = " + countWords(str));

        scanner.close();
    }
}
