package BinarySearch;

public class CountOfRotation {
    static void main(String[] args) {
        int[] arr = {15, 18, 2, 3, 6, 12};
//        int[] arr = {2, 3, 6, 12, 15, 18};
//        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int ans = pivot(arr)+1;
        System.out.println(ans);
    }
    static int pivot(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(mid < end && arr[mid] > arr[mid+1]) {
                return mid;
            }
            else if(mid > start && arr[mid] < arr[mid-1]) {
                return mid-1;
            }
            else if(arr[start] >= arr[mid]) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
