package coutWords;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class countAndExtractWords {

    public static List<String> manualSplit(String str){
        List<String> words = new ArrayList<>();
        String currentWord = "";

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(ch != ' '){
                currentWord += ch;
            }else{
                if(!currentWord.isEmpty()){
                    words.add(currentWord);
                    currentWord = "";
                }
            }
        }

        if(!currentWord.isEmpty()) {
            words.add(currentWord);
        }

        System.out.println("Number of words is = " + words.size());
        return words;
    }

    public static void main(String[] args) {
        //Count the number of words from a string and also extract the words, and display them.
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your string: ");
        String str = scanner.nextLine();

        System.out.println(manualSplit(str));

        scanner.close();
    }
}
