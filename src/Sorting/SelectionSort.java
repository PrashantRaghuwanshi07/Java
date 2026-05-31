package Sorting;

import java.util.Arrays;

public class SelectionSort {
    static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr) {
         for(int i=0; i<arr.length; i++) {
             int max = 0;
             for(int j=0; j<arr.length-i; j++) {
                 if (arr[j] > arr[max]) {
                     max = j;
                 }
             }
             int temp = arr[max];
             arr[max] = arr[arr.length-i-1];
             arr[arr.length-i-1] = temp;
         }
    }
}
