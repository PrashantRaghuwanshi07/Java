package Arrays;
import java.util.Scanner;
import java.util.Arrays;

public class MultidimensionalArr {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//    int[][] arr = {
//            {1,2,3}, // 0th index
//            {4,5,6}, // 1st index
//            {7,8,9} // 2nd index
//    }; // it is stored as the array of array
        int[][] arr = new int[3][3];
//        System.out.println(arr.length); // no of rows
        //input
        for (int row = 0; row < arr.length; row++) {
            // for each col in every row
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }
        }
        // output
        for (int row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(arr[row]));
        }
    }
}