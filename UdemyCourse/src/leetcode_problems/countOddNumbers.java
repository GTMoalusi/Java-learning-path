package leetcode_problems;

import java.util.Scanner;

public class countOddNumbers {

    public static int countOdds(int low, int high){
        int count = 0;

        for(int i = low; i <= high; i++){
            if(i % 2 != 0){
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        //Leetcode.
        //Count Odd Numbers in an Interval Range
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your low value: ");
        int low = scanner.nextInt();

        System.out.print("Enter your high value: ");
        int high = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Output: " + countOdds(low, high));
    }
}
