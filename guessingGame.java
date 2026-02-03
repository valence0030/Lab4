
import java.util.Scanner;

public class guessingGame {

    public static void main(String[] args) {
         
        int guess = 4;
        int counter = 1;

         Scanner input = new Scanner(System.in);
         System.out.println("Guess the number");
         int number = input.nextInt();

         while(number!=guess){

            
            System.out.println("Wrong guess");
            System.out.println("Try another guess");
            number = input.nextInt();

            counter ++;
    
         }

         System.out.println("Correct!");
         System.out.println("you performed " + counter + " attempts");
         input.close();
    }
    
}
