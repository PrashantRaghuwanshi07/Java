package Questions;

public class Fibo {
    static void main(String[] args) {
        int n = 10;
        System.out.println(sum(n));
    }
    static int sum(int n) {
        if(n==0) {
            return 0;
        }
        int current = n + sum(n-1);
        return current;
    }

}
