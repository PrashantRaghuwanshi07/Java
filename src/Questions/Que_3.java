package Questions;

import java.util.Arrays;
// prefix sum of those which have bit 1 at the last
public class Que_3 {
    static void main(String[] args) {
        int[] arr = {6, 7, 8, 9, 10};
        int[] prefixSum = new int[arr.length];
        int sum = 0;
        for(int i=0; i<arr.length; i++) {
            if((arr[i] & 1) == 0) {
                sum = sum + arr[i];
            }
            prefixSum[i] = sum;
        }
        System.out.println(Arrays.toString(prefixSum));
    }
}
