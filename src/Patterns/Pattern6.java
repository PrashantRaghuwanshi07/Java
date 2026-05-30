package Patterns;

/*

         1
       2 1 2
     3 2 1 2 3
   4 3 2 1 2 3 4
 5 4 3 2 1 2 3 4 5
   4 3 2 1 2 3 4
     3 2 1 2 3
       2 1 2
         1

*/

public class Pattern6 {
    static void main(String[] args) {
        pattern(5);
    }
    static void pattern(int n) {
        for(int row=1; row<2*n; row++) {
            int spaces = row <= n ? 2*(n-row) : 2*(row-n);
            for(int s=0; s<=spaces; s++) {
                System.out.print(" ");
            }
            int colInRow = row <= n ? row : 2*n-row;
            for(int col=colInRow; col>=1; col--) {
                System.out.print(col + " ");
            }
            for(int col=2; col<=colInRow; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
