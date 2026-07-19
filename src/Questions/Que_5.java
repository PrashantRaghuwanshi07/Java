package Questions;
// sliding window - logest subarray without duplicates
public class Que_5 {
    static void main(String[] args) {
        char[] arr = {'a', 'b', 'b', 'c', 'a', 'd', 'd', 'a'};
        int start = 0;
        int end = 1;
        int len = 0;
        for(int i=2; i<arr.length; i++) {
            if(arr[i] != arr[start] && arr[i] != arr[end]) {
                end++;
                if((end - start + 1) > len) {
                    len = end - start + 1;
                }
            }

        }
        System.out.println(len);
    }
}
