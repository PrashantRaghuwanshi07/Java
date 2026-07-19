package Questions;
import java.util.Arrays;
public class Que_2 {
    static class Pair {
        int value;
        int index;

        Pair(int value, int index) {
            this.value = value;
            this.index = index;
        }
    }
    static void main(String[] args) {
        int[] arr = {1, 3,6, 5, 2};
        int target = 11;
        System.out.println(Arrays.toString(twoSum(arr, target)));
    }
    static int[] twoSum(int[] arr, int target) {
        Pair[] nums = new Pair[arr.length];
        for(int i=0; i<nums.length; i++) {
            nums[i] = new Pair(arr[i], i);
        }
        Arrays.sort(nums, (a, b) -> a.value - b.value);
        int start = 0;
        int end = nums.length-1;
        while(start < end) {
            int sum = nums[start].value + nums[end].value;
            if (sum == target) {
                return new int[]{nums[start].index, nums[end].index};
            } else if (sum > target) {
                end--;
            } else {
                start++;
            }
        }
        return new int[] {-1, -1};
    }
}
