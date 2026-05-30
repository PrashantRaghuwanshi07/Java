package Patterns;

/*

*****
****
***
**
*

*/
public class Pattern2 {
    static void main(String[] args) {
        pattern(5);

    }
    static void pattern(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n-i+1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
