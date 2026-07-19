package Questions;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BinarySearch {
    static void main(String[] args) {
        int[] arr = {5,7,7,8,8,10};
        int target = 8;
        int[] ans = {-1, -1};
        int start = Binarysearch(arr, target, true);
        int end = Binarysearch(arr, target, false);
        ans[0] = start;
        ans[1] = end;
        System.out.println(Arrays.toString(ans));
    }
    static int Binarysearch(int[] arr, int target, boolean findStart) {
        int start = 0;
        int end = arr.length-1;
        int ans = -1;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(arr[mid] > target) {
                end = mid - 1;
            }
            else if(arr[mid] < target) {
                start = mid + 1;
            }
            else {
                ans = mid;
                if(findStart == true) {
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }

}
