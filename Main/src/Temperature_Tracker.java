import java.util.Scanner;

public class Temperature_Tracker {
    public static void main(String[] args) {

        //Temperature tracker. User input
        Scanner scanner = new Scanner(System.in);

        //Determine array size.
        System.out.print("Enter the size of the array: ");
        int arraySize = scanner.nextInt();

        //Variable/Array Declaration and Initialization
        double[] temperature = new double[arraySize];
        double sum = 0;

        for(int i = 0; i < temperature.length; i++){
            System.out.print("Please enter your daily temperature, day-" + (i + 1) + ": ");
            temperature[i] = scanner.nextDouble();
            sum += temperature[i];
        }

        //Output of the average
        System.out.printf("The average is: %.2f",  (sum / temperature.length));

        scanner.close();
    }
}