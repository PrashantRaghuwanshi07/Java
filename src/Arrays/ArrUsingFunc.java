package Arrays;

import java.util.Arrays;

public class ArrUsingFunc {
    static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        System.out.println(Arrays.toString(nums));
        arr(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void arr(int[] arr) {
        arr[1] = 100;
    }
}
