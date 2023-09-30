/*
Link: https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
Theory:
    Search for min and max by calling binary Search twice
    For finding min, update high as mid -1 on finding min, so that we can find the target value in an even lower position
    Same for max, update it as low = mid +1
 */

public class FindFirstAndLastPositionOfElementInSortedArray {
    public int[] searchRange(int[] nums, int target) {
        int[] output = new int[2];
        output[0] = binarySearch(nums, target, true);
        output[1] = binarySearch(nums, target, false);
        return output;
    }

    public int binarySearch (int[] nums, int target, boolean findMin) {
        int low = 0;
        int high = nums.length - 1;
        int output = -1;
        while (low <= high) {
            int mid = (high + low) / 2;
            if (nums[mid] == target) {
                output = mid;
                if (findMin) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else if (nums[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return output;
    }
}
