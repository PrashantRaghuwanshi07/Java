package Patterns;

/*

        1
      2 1 2
    3 2 1 2 3
  4 3 2 1 2 3 4
5 4 3 2 1 2 3 4 5

*/

public class Pattern5 {
    static void main(String[] args) {
        pattern(5);
    }
    static void pattern(int n) {
        for(int row=1; row<=n; row++) {
            int spaces = 2*n - 2*row;
            for(int s=0; s<=spaces; s++) {
                System.out.print(" ");
            }
            for(int col=row; col>=1; col--) {
                System.out.print(col + " ");
            }
            for(int col=2; col<=row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
