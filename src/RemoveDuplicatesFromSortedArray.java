/*
Link: https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
Theory:
    1. Create a pointer that tracks the size and first not unique element
    2. Create a for loop that starts from index 1
    3. If u find the next unique element, put it in the jth position
    4. Increment j
    5. Return j after for loop ends
 */


public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int j=1;
        for (int i=1; i<nums.length; i++) {
            if (nums[i] != nums[i-1]) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}
