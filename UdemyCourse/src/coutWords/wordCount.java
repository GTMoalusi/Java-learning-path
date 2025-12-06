package coutWords;

import java.util.Scanner;

public class wordCount {

    public static int countWords(String str){
        String[] words = str.split("\\s+");

        int counter = 0;

        for(String word : words){
            if(!word.isEmpty()){
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        //Count the number of words in a sentence...Quiz

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your string: ");
        String str = scanner.nextLine();

        System.out.println("Number of words is: " + countWords(str));

        scanner.close();
    }
}