public class CountNegNumsInSortedMatrix {
    public int countNegatives(int[][] grid) {
        int count =0;
        int n = grid.length;
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
