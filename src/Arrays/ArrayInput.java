package Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class ArrayInput {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // arr of primitives
//        int[] arr = new int[5];
//        for(int i=0; i< arr.length;i++) {
//            arr[i] = in.nextInt();
//        }
//        for(int i=0; i< arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
//        System.out.println(Arrays.toString(arr)); // covert arr into string and print it

        // arr of objects
        String[] str = new String[5];
        for(int i=0; i< str.length; i++) {
            str[i] =in.next();
        }
        System.out.println(Arrays.toString(str));

        // modify
        str[1] = "Prashant";
        System.out.println(Arrays.toString(str));
    }
}
