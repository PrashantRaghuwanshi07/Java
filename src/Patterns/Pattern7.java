package Patterns;

/*

1 1 1 1 1 1 1 1 1
1 2 2 2 2 2 2 2 1
1 2 3 3 3 3 3 2 1
1 2 3 4 4 4 3 2 1
1 2 3 4 5 4 3 2 1
1 2 3 4 4 4 3 2 1
1 2 3 3 3 3 3 2 1
1 2 2 2 2 2 2 2 1
1 1 1 1 1 1 1 1 1

*/

public class Pattern7 {
    static void main(String[] args) {
        pattern(5);
    }
    static void pattern(int n) {
        for(int row=1; row<2*n; row++) {
            for(int col=1; col<2*n; col++) {
                int atEveryIndex = Math.min(Math.min(row, col), Math.min(2*n-col, 2*n-row));
                System.out.print(atEveryIndex + " ");
            }
            System.out.println();
        }
    }
}
