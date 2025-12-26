package two_pointer_String;

import java.util.Scanner;

public class sumOfTwoPointerEqualsTarget {

    public static boolean twoSum(int[] arr, int target){

        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] + arr[j] == target){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter an int for your target: ");
        int target = scanner.nextInt();

        int[] arr = {23, -19, 43, 31};

        if(twoSum(arr, target)){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}
