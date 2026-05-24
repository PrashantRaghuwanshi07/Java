package BinarySearch;

public class RotatedBSwithDuplicates {
    static void main(String[] args) {
        int[] arr = {4, 5, 5, 6, 7, 0, 1, 1, 2};
        int target = 0;
        int ans = search(arr, target);
        System.out.println(ans);
    }
    static int search(int[] arr, int target) {
        int pivot = findPivotwithDuplicates(arr);
        if(pivot == -1) {
            return BinarySearch(arr, target, 0, arr.length-1);
        }
        if(arr[pivot] == target) {
            return pivot;
        }
        if(arr[0] > target) {
            return BinarySearch(arr, target, pivot+1, arr.length-1);
        }
        else {
            return BinarySearch(arr, target, 0, pivot-1);
        }
    }
    static int BinarySearch(int[] arr, int target, int start, int end) {
        while(start <= end) {
            int mid = start + (end-start)/2;
            if(target < arr[mid]) {
                end = mid - 1;
            }
            else if(target > arr[mid]) {
                start = mid + 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
    static int findPivotwithDuplicates(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            //case 1
            if(mid < end && arr[mid] > arr[mid+1]) {
                return mid;
            }
            //case 2
            if(mid > start && arr[mid] < arr[mid-1]) {
                return mid-1;
            }
            //case 3
            if(arr[mid] == arr[start] && arr[mid] == arr[end]) {
                if(arr[start] > arr[start+1]) {
                    return start;
                }
                start++;
                if(arr[end] < arr[end-1]) {
                    return end;
                }
                end--;
            }
            else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
