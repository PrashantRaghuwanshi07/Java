package Recursion;
// find nth term of the seq
public class Fibonacci {
    static void main(String[] args) {
        System.out.println(fibo(7));
    }
    static int fibo(int n) {
        if(n < 2) {
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }
}