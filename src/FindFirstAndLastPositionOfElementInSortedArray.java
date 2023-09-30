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
