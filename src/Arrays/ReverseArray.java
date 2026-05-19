package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of the Array : ");
        int[] arr = new int[in.nextInt()];
        System.out.print("Enter the array : ");
        for(int i=0; i<arr.length; i++) {
            arr[i] = in.nextInt();
        }
        reverse(arr);
        System.out.println("Resulted Array : " + Arrays.toString(arr));
    }
    static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        while(start<end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start = start+1;
            end = end-1;
            }
        }


}
