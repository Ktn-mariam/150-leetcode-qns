
/*
Link: https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
Theory: Initialise a count array of size 101 (Range of numbers is 0-100)
        Initialise an output array of size of nums
        Find the count of each element in the array but incrementing the value with that index
        Then for each element, add it prev count to save the count of numbers before it
        Output array will contain count of each all numbers smaller than it, hence, count[num[i]-1]
 */
public class CountOfNumbersSmallerThanCurrent {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int output[] = new int[nums.length];
        int[] count = new int[101];
        for (int n: nums) {
            count[n]++;
        }

        for (int i=1; i<count.length; i++) {
            count[i] += count[i-1];
        }
        for (int i=0; i<nums.length; i++) {
            output[i] = nums[i] == 0 ? 0 : count[nums[i]-1];
        }
        return output;
    }
}
