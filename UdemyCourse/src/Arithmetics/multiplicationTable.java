package Arithmetics;

import java.util.Scanner;

public class multiplicationTable {

    public static int multipleTable(int input){

        int results = 0;

        for(int i = 1; i <= 10; i++){
            System.out.println(input + " X " + i + " = " + input * i);
        }

        return results;
    }

    public static void main(String[] args) {
        //Write a Java program that takes a number as input and prints its multiplication table up to 10.
        //Input a number: 8

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your whole number: ");
        int input = scanner.nextInt();
        scanner.nextLine();

        System.out.println(multipleTable(input));
    }
}
