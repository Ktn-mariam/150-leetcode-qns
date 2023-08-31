import java.util.*;
// LINK: https://leetcode.com/problems/two-sum/

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i=0; i<nums.length; i++){
            int search = target - nums[i];
            if (hm.containsKey(search)){
                return new int[]{hm.get(search), i};
            } else {
                hm.put(nums[i], i);
            }
        }
        return new int[]{0,0};
    }
}
