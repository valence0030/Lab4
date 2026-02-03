public class MultiDimensionalArray {

    public static void main(String[] args) {
        
        int[][] marks = {
            {65,70,80},
            {55,60,75},
            {90,85,88}
        };


         for(int i = 0; i < marks.length; i++){

            for(int j = 0; j < marks[i].length; j++){

                System.out.print(marks[i][j] + " ");

            }

            System.out.println();
        } 

        

    }
    
}
