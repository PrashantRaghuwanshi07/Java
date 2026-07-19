package Questions;

import java.util.Arrays;

//product of arr without itself
public class Que_4 {
    static void main(String[] args) {
        int[] nums = {1, 2,3, 4, 5};
        int[] ans = new int[nums.length];
        for(int i=0; i<nums.length; i++) {
            int leftproduct = 1;
            int rightproduct = 1;
            if(i< nums.length-1) {
                for (int j = i + 1; j < nums.length; j++) {
                    leftproduct = leftproduct * nums[j];
                }
            }
            if(i>0) {
                for (int j = 0; j < i; j++) {
                    rightproduct = rightproduct * nums[j];
                }
            }
            ans[i] = rightproduct * leftproduct;
        }
        System.out.println(Arrays.toString(ans));
    }
}
