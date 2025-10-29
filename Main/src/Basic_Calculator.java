import java.util.Scanner;

public class Basic_Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your first number: ");
        double firstNum = scanner.nextDouble();
        System.out.print("Enter your second number: ");
        double secondNum = scanner.nextDouble();
        System.out.print("Enter your third number: ");
        double thirdNum = scanner.nextDouble();

        System.out.print("Please enter your operator(+, -, /, *, %): ");
        char operator = scanner.next().charAt(0);

        //Calling my methods.
        addition(firstNum, secondNum, thirdNum, operator);
        subtraction(firstNum, secondNum, thirdNum, operator);
        division(firstNum, secondNum, thirdNum, operator);
        multiplication(firstNum, secondNum, thirdNum, operator);
        modulus(firstNum, secondNum, thirdNum, operator);
    }

    public static void addition(double firstNum, double secondNum, double thirdNum, char operator){
        if(operator == '+'){
            double sum = firstNum + secondNum + thirdNum;
            System.out.println(sum);
        }
    }

    public static void subtraction(double firstNum, double secondNum, double thirdNum, char operator){
        if(operator == '-'){
            double sum = firstNum - secondNum - thirdNum;
            System.out.println(sum);
        }
    }

    public static void division(double firstNum, double secondNum, double thirdNum, char operator){
        if(operator == '/'){
            if(firstNum == 0){
                double sum = secondNum / thirdNum;
                System.out.println(sum);
            }else if(secondNum == 0){
                double sum = firstNum / thirdNum;
                System.out.println(sum);
            }else{
                double sum = firstNum / secondNum;
                System.out.println(sum);
            }
        }
    }

    public static void multiplication(double firstNum, double secondNum, double thirdNum, char operator){
        if(operator == '*'){
            double sum = firstNum * secondNum * thirdNum;
            System.out.println(sum);
        }
    }

    public static void modulus(double firstNum, double secondNum, double thirdNum, char operator){
        if(operator == '%'){
            if(firstNum == 0){
                double sum = secondNum % thirdNum;
                System.out.println(sum);
            }else if(secondNum == 0){
                double sum = firstNum % thirdNum;
                System.out.println(sum);
            }else{
                double sum = firstNum % secondNum;
                System.out.println(sum);
            }
        }
    }
}
