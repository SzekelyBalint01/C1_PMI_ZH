import java.util.ArrayList;

public class Matrix {
    public static int sumOfEvenNumbers(int[][] tomb){

        int temp = 0;

        for(int i = 0; tomb.length>i; i++){
            for(int k = 0; tomb[i].length>k; k++) {

                if(tomb[i][k]%2==0 ) {
                    temp= temp+tomb[i][k];
                }

            }
        }
        return temp;
    }

    public static ArrayList<Integer> rowsWithZero(int[][] tomb){

        ArrayList<Integer> temp = new ArrayList<>();

        for(int i = 0; tomb.length>i; i++){
            for(int k = 0; tomb[i].length>k; k++) {

                if(tomb[i][k]==0) {
                   temp.add(i);

                }

            }
        }
        return temp;
    }
}
