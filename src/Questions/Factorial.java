package Questions;

public class Factorial {
    static void main(String[] args) {
        int n = 5;
        fac(n);
        System.out.println(fac(n));
    }
    static int fac(int n){
        if (n == 0) {
            return 1;
        }
        int product = n * fac(n-1);
        return product;
    }
}
