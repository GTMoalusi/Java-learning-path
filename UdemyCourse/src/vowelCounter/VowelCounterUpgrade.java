package vowelCounter;

import java.util.Scanner;

public class VowelCounterUpgrade {

    public static void vowels(String str){

        str = str.toLowerCase();

        int a = 0, e = 0, i = 0, o = 0, u = 0;

        for(char c : str.toCharArray()){
            if(c == 'a') a++;
            else if(c == 'e') e++;
            else if(c == 'i') i++;
            else if(c == 'o') o++;
            else if(c == 'u') u++;
        }

        System.out.println("a = " + a);
        System.out.println("e = " + e);
        System.out.println("i = " + i);
        System.out.println("o = " + o);
        System.out.println("u = " + u);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your string: ");
        String str = scanner.nextLine();

        vowels(str);
    }
}
