/*
Link: https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/
Theory:
    1- Use the idea of binary search
    2- grid.length - lowest position of negative numbers = number of -ve numbers
    3- keep adding the count
    4-return count
 */

public class CountNegNumsInSortedMatrix {
    public int countNegatives(int[][] grid) {
        int count =0;
        for (int i=0; i<grid.length; i++) {
            int low = 0;
            int high = grid[i].length-1;
            while (low <= high) {
                int mid = (low + high)/2;
                if (grid[i][mid] < 0) {
                    high = mid-1;
                } else {
                    low = mid + 1;
                }
            }
            count += grid[i].length - low;
        }
        return count;
    }
}
