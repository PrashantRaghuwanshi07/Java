package LinearSearch;

public class FindMin {
    static void main(String[] args) {
        int[] arr = {5, 2, 0, -1, 6, 7, -9};
        System.out.println(min(arr));
    }
    // assume not empty array
    static int min(int[] arr) {
        int min = arr[0];
        for(int i=0; i< arr.length; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}
