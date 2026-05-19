package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Swap {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.print("Enter the array of size 5 : ");
        for(int i=0; i<5; i++) {
            arr[i] = in.nextInt();
        }
        swap(arr, 1, 3);
        System.out.println("Resulted array : " + Arrays.toString(arr));
    }
    static void swap(int[] arr, int index1, int index3) {
        int temp = arr[index1];
        arr[index1] = arr[index3];
        arr[index3] = temp;
    }
}
