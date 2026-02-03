
import java.util.Scanner;

public class MenuProgram {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("MENU");
        System.out.println("1. Say Hello");
        System.out.println("2. Show Current year");
        System.out.println("3. Exit");
        System.out.println("Enter your option.");
        int opt = input.nextInt();

        do{

            if(opt==1){

                System.out.println("Hello there!");
            }

            else if(opt==2){

                System.out.println("2025");
            }
        System.out.println("MENU");
        System.out.println("1. Say Hello");
        System.out.println("2. Show Current year");
        System.out.println("3. Exit");
        System.out.println("Enter your option.");
        opt = input.nextInt();

        } while(opt != 3);


    }
    
}
