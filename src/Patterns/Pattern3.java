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

public class Pattern3 {
    static void main(String[] args) {
        pattern(5);
    }
    static void pattern(int n) {
        for(int row=1; row<n*2; row++) {
//            if(row <= n) {
//                for(int j=1; j<=row; j++) {
//                    System.out.print("* ");
//                }
//                System.out.println();
//            }
//            else {
//                for(int j=1; j<=2*n-row; j++) {
//                    System.out.print("* ");
//                }
//                System.out.println();
//            }
            int totalColInRow = row > n ? 2*n-row : row;
            for(int col=1; col<=totalColInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
