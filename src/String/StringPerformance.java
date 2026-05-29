package String;

public class StringPerformance {
    static void main(String[] args) {
        String series = "";
        for(int i=0; i<26; i++) {
            char ch = (char)('a'+i);
            series = series + ch;
        }
        System.out.println(series);
// problem is it creating a new object every time because string is immutable
//soo much garbage value is there and time complexity is O(N^2)
//Therefore we use such datatype which keeps on changing
    }
}
