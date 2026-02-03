
import java.util.Scanner;

public class TernaryOperator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an Integer: ");
        int number = input.nextInt();

        System.out.println((number%2 == 0)?"The number is Even" : "The number is Odd");

    }
    
}
