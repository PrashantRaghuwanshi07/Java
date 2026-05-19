package Arrays;

import java.util.Scanner;

public class Max {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[7];
        System.out.print("Enter the array of size 7 : ");
        for(int i=0; i<5; i++) {
            arr[i] = in.nextInt();
        }
        int ans = IsMax(arr);
        System.out.println("Max is : " + ans);
    }
    static int IsMax(int[] arr) {
        int max = 0;
        max = arr[0];
        if(arr.length ==0) {
            return -1;
        }
        for(int i=1; i<7; i++) {
            if(arr[i]>max) {
                max = arr[i];
            }
        }
        return max;
    }
}
