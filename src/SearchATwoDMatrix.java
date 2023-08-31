// LINK: https://leetcode.com/problems/search-a-2d-matrix/description/
/*
THEORY:
    1-Consider a 2D matrix like a 1D matrix itself
    2-The high value is rows*cols-1;
    3-midVal is matrix[mid/cols][mid%cols]
    4-The rest is same as regular binary Search
 */
public class SearchATwoDMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        if (rows == 0) return false;
        int cols = matrix[0].length;
        int high = rows * cols-1;
        int low = 0;

        while (low <= high){
            int mid = (low + high) /2;
            int midVal = matrix[mid/cols][mid%cols];

            if (midVal == target) return true;
            else if (midVal < target) low = mid +1;
            else high = mid-1;
        }
        return false;
    }
}

/*
NEW SYNTAX:
    1-The number of rows in a 2D Matrix is: matrix.length
    2-The number of cols in a 2D Matrix is: matrix[0].length
 */
