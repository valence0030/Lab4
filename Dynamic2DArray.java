

import java.util.Scanner;

public class Dynamic2DArray{

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = input.nextInt();

        System.out.print("Enter the number of columns: ");
        int cols = input.nextInt();

        int[][] arr = new int[rows][cols];

        int value = 1;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {

                arr[i][j] = value;
                value++;
            }
        }

        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}
