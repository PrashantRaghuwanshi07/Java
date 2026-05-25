package BinarySearch;

import java.util.Arrays;

public class SortedMatrix {
    static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(Arrays.toString(search(arr, 6)));
    }
    static int[] BinarySearch(int[][] matrix, int target, int row, int cStart, int cEnd) {
        while(cStart <= cEnd) {
            int mid = cStart + (cEnd - cStart) / 2;
            if(matrix[row][mid] == target) {
                return new int[]{row, mid};
            }
            if(matrix[row][mid] < target) {
                cStart = mid + 1;
            }
             else {
                 cEnd = mid - 1;
            }
        }
        return new int[]{-1, -1};
    }


    static int[] search(int[][] matrix,int target) {
        int row = matrix.length;
        int col = matrix[0].length; // be cautions matrix may be empty
        if(row == 1) {
            return BinarySearch(matrix, target, 0, 0, col-1);
        }
        int rStart = 0;
        int rEnd = row-1;
        int cMid = col / 2;
        while(rStart < (rEnd - 1)) {
            int mid = rStart + (rEnd - rStart) / 2;
            if(matrix[mid][cMid] == target) {
                return new int[] {mid, cMid};
            }
            if(matrix[mid][cMid] < target) {
                rStart = mid;
            }
            else {
                rEnd = mid;
            }
        }
        if(matrix[rStart][cMid] == target) {
            return new int[] {rStart, cMid};
        }
        if(matrix[rStart+1][cMid] == target) {
            return new int[] {rStart+1, cMid};
        }
        // search in 1st half
        if(target <= matrix[rStart][cMid-1] && target >= matrix[rStart][0]) {
            return BinarySearch(matrix, target, rStart, 0, cMid-1);
        }
        // search in 2nd half
        if(target <= matrix[rStart+1][cMid-1] && target >= matrix[rStart + 1][0]) {
            return BinarySearch(matrix, target, rStart+1, 0, cMid-1);
        }
        // search in 3rd half
        if(target >= matrix[rStart][cMid+1] && target <= matrix[rStart][col-1]) {
            return BinarySearch(matrix, target, rStart, cMid+1, col-1);
        }
        // search in 4th half
        else {
            return BinarySearch(matrix, target, rStart+1, cMid+1, col-1);
        }
    }
}
