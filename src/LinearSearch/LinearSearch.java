package LinearSearch;

import java.util.Scanner;
import java.util.Arrays;

// search target in the array and return the index if target found

public class LinearSearch {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int[] arr = new int[in.nextInt()];
        System.out.print("Enter the array : ");
        for(int i=0; i<arr.length; i++) {
            arr[i] = in.nextInt();
        }
        System.out.print("Enter the target : ");
        int target = in.nextInt();
        int ans = linear(arr, target);
        System.out.println(ans);
    }
    static int linear(int[] arr, int target) {
        if(arr.length == 0) {
            return -1;
        }
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
