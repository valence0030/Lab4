
import java.util.Scanner;

public class multiplicationtable {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number:  ");
        int number = input.nextInt();
        System.out.println("Table of " + number);
        System.out.println(number + " times is ");
            System.out.println("_________________");

        for(int i = 1; i <=12; i++){

            int result = number*i;
            

            System.out.println( number + " * " + i + " = " + result);
        }

    }
    
}
