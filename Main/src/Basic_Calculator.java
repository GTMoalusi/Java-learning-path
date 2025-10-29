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

        if(operator == '+'){
            double sum = firstNum + secondNum + thirdNum;
            System.out.println(sum);
        }else if(operator == '-'){
            double sum = firstNum - secondNum - thirdNum;
            System.out.println(sum);
        }else if(operator == '*'){
            double sum = firstNum * secondNum * thirdNum;
            System.out.println(sum);
        }else if(operator == '/'){
            if(firstNum == 0){
                double sum = secondNum / thirdNum;
                System.out.println(sum);
            }else if(secondNum == 0){
                double sum = firstNum / thirdNum;
                System.out.println(sum);
            }else if(thirdNum == 0){
                double sum = firstNum / secondNum;
                System.out.println(sum);
            }
        }else if(operator == '%'){
            if(firstNum == 0){
                double sum = secondNum % thirdNum;
                System.out.println(sum);
            }else if(secondNum == 0){
                double sum = firstNum % thirdNum;
                System.out.println(sum);
            }else if(thirdNum == 0){
                double sum = firstNum % secondNum;
                System.out.println(sum);
            }
        }
    }
}
