
import java.util.Scanner;

public class calculator {

    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter a second number: ");
        int num2 = input.nextInt();

        System.out.print("Enter the operation you want to perform(-,+,/,*): ");
        String operator = input.next();

        switch(operator){

            case "+":
            int result = num1 + num2;
            System.out.println(result);
            break;

            case "-":
            result = num1 - num2;
            System.out.println(result);
            break;

            case "*":
            result = num1 * num2;
            System.out.println(result);
            break;

            case "/":
            result = num1 / num2;
            System.out.println(result);
            break;

            default:
                System.out.println("invalid operator.");

        }

    }
    
}
