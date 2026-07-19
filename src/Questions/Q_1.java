package Questions;
/*
Q4. Maximum Total Value
Attempted
Hard
6 pt.
You are given two integer arrays value and decay, and an integer m.

value[i] represents the initial value at index i.
decay[i] represents how much the value decreases after each selection of index i.
You may select any index multiple times. The total number of selections across all indices must not exceed m.

If you select index i for the tth time, where t is 1-indexed, the value gained is value[i] - decay[i] * (t - 1).

Return the maximum total value you can obtain. Since the answer may be large, return it modulo 109 + 7.



Example 1:

Input: value = [6,5,4], decay = [2,1,1], m = 4

Output: 19

Explanation:

One optimal sequence of selections is as follows:

By selecting index 0, the value gained is 6.
By selecting index 1, the value gained is 5.
By selecting index 2, the value gained is 4.
By selecting index 0 again, the value gained is 6 - 2 = 4.
The total value is 6 + 5 + 4 + 4 = 19. No other sequence of at most 4 selections gives a higher total value.

Example 2:

Input: value = [7,2,2], decay = [3,2,1], m = 2

Output: 11

Explanation:

One optimal sequence of selections is as follows:

By selecting index 0, the value gained is 7.
By selecting index 0 again, the value gained is 7 - 3 = 4.
The total value is 7 + 4 = 11.

Example 3:

Input: value = [4,3], decay = [5,4], m = 5

Output: 7

Explanation:

One optimal sequence of selections is as follows:

By selecting index 0, the value gained is 4.
By selecting index 1, the value gained is 3.
The total value is 4 + 3 = 7.



Constraints:

1 <= value.length == decay.length <= 105
1 <= value[i], decay[i] <= 109​​​​​​​
1 <= m <= 109
 */

public class Q_1 {
        static void main(String[] args) {
            int[] value = {7,2,2};
            int[] decay = {3,2,1};
            int m = 2;
            System.out.println(maxTotalValue(value, decay, m));
        }
        static int maxTotalValue(int[] value, int[] decay, int m) {
            int[] times= new int[value.length];
            for(int i=0; i<times.length; i++) {
                times[i] = 0;
            }
            long[] updated = new long[value.length];
            for(int i=0; i<updated.length; i++) {
                updated[i] = value[i];
            }
            long sum = 0;
            int MOD = 1000000007;
            while(m > 0) {
                int max = 0;
                for(int i=0; i<updated.length; i++) {
                    if(updated[i] >= updated[max]) {
                        max = i;
                    }
                }
                if(updated[max] <= 0) {
                    break;
                }
                sum = sum + updated[max];
                times[max] = times[max] + 1;
                updated[max] = (long) value[max] - (long) decay[max] * times[max];
                m--;
            }
            return (int)(sum % MOD);
        }
    }

