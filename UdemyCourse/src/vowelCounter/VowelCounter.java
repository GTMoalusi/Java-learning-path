package vowelCounter;

import java.util.Scanner;

public class VowelCounter {

    public static void vowelCounter(String str){
        str = str.toLowerCase();

        char[] myVowels = {'a', 'e', 'i', 'o', 'u'};

        int count = 0;

        String newStr = "";

        //Nested Loop
        for(char c : str.toCharArray()){
            for(char v : myVowels){
                if(c == v){
                    count++;
                    newStr += c;
                    break;
                }
            }
        }

        System.out.println("The number of vowels found: " + count);
        System.out.println("The vowels found from the given string: " + newStr);
    }

    public static void main(String[] args) {

        //Given a string, identify how many vowels are in it.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your string: ");
        String str = scanner.nextLine();

        vowelCounter(str);
    }
}
