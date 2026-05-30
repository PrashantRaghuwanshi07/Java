package Patterns;

/*

    *
   * *
  * * *
 * * * *
* * * * *
 * * * *
  * * *
   * *
    *

*/

public class Pattern4 {
    static void main(String[] args) {
        pattern(5);
    }
    static void pattern(int n) {
        for(int row=1; row<2*n; row++) {
            int spaces = row <= n ? n-row : row-n;
            for(int s=0; s<=spaces; s++) {
                System.out.print(" ");
            }
            int colInRow = row <= n ? row : 2*n-row;
            for(int col=1; col<= colInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
