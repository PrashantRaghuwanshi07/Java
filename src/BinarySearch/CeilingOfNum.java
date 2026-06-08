package BinarySearch;
// ceiling of no means smallest no which is equal or largest to that no

public class CeilingOfNum {
    static void main(String[] args) {
//        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int[] arr = {18, 16, 14, 9, 5, 3, 2};
        int target = 15;
        int ans = ceiling(arr, target);
        System.out.println(ans);
    }
    static int ceiling(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;
        boolean isAsc;
        if(arr[start] < arr[end]) {
            isAsc = true;
        }
        else {
            isAsc = false;
        }
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(target == arr[mid]) {
                return arr[mid];
            }
            if(isAsc == true) {
                if(target < arr[mid]) {
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }
            else{
                if(target < arr[mid]) {
                    start = mid + 1;
                }
                else {
                    end = mid - 1;
                }
            }
        }
        // when while loop break, start = end + 1 then next big no is start
        // (end target start)
        if(isAsc == true) {
            return arr[start];
        }
        else {
            return arr[end];
        }
    }
}
