/*
    THEORY
    Works only if the array is sorted !!
    1-Initialize high as array.length -1 and low as 0
    2-Run a while loop as long as high >= low
    2-Find the middle index => (high + low)/2
    3-Check if array[mid] = target
    4-If not, check if array[mid] > target
        => target is in the lower half of the array
        => make high = low - 1
    5-Else low = mid + 1
    6-Repeat while loop until you find target
    7-Else return -1
 */

public class BinarySearch {
    // Iterative method
    public int search(int[] nums, int target) {
        int low = 0, high = nums.length-1;

        while (high >= low) {
            int mid = (low + high) / 2;
            if (nums[mid] == target){
                return mid;
            } else if (nums[mid] > target){
                high = mid -1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    // Recursive Method
    public int recursiveSearch (int[] nums, int low, int high, int target){
        int mid = high + low /2;
        if (high >= low) {
            if (nums[mid] == target) return mid;
            else if (nums[mid] > target) {
                recursiveSearch(nums, low, mid - 1, target);
            } else {
                recursiveSearch(nums, mid + 1, high, target);
            }
        }
        return -1;
    }
}
