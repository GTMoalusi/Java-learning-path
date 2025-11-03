public class Even_Numbers {
    public static void main(String[] args) {
        //Write a program that sums even numbers up to 50 using a while loop.

        int sum = 0;
        int currentNumber = 2;

        while(currentNumber <= 50){
            sum += currentNumber;
            currentNumber += 2;
        }

        System.out.println(sum);
    }
}
