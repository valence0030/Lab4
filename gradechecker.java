
import java.util.Scanner;

public class gradechecker{

    public static void main (String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the score");
        double score = input.nextDouble();

        if(score >= 70 && score <= 100){

            System.out.println("you scored A");
        }

    else if(score >=60 && score <= 69){

        System.out.println("you scored B");

    }

    else if(score >=50 && score <= 59){

        System.out.println("you scored C");

    }

    else if(score >=40 && score <= 49){

        System.out.println("you scored D");

    }

    else if(score < 40 && score >= 0){

        System.out.println("you scored F");

    }

    else {

        System.out.println("The score you entered is invalid");
    }


        


    }
}